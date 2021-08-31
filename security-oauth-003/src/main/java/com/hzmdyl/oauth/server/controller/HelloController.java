package com.hzmdyl.oauth.server.controller;

import com.hzmdyl.oauth.server.bean.DataRtn;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.endpoint.TokenEndpoint;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <p></p>
 * <p></p>
 *
 * @author 王森明
 * @date 2021/4/28 17:25
 * @since 1.0.0
 */
@RestController
public class HelloController {

    private final TokenEndpoint tokenEndpoint;

    public HelloController(TokenEndpoint tokenEndpoint) {
        this.tokenEndpoint = tokenEndpoint;
    }

    /**
     * 重写令牌申请接口,返回自定义数据格式
     *
     * @param principal
     * @param parameters
     * @return
     * @throws HttpRequestMethodNotSupportedException
     */
    @PostMapping("/oauth/token")
    public DataRtn postAccessTokenWithUserInfo(Principal principal, @RequestParam Map<String, String> parameters) throws HttpRequestMethodNotSupportedException {
        /**
         * {
         *     "access_token": "3932f9f2-175b-439d-b140-6ce0806a37df",
         *     "token_type": "bearer",
         *     "refresh_token": "93e2209a-53a6-45ac-8183-48c40086668a",
         *     "expires_in": 14399,  --有效时间秒
         *     "scope": "read"
         * }
         *
         * 替换成
         * {
         * "access_token":"cae9aca7-3d2f-4ea5-ad34-0d391e64fef2",
         * "expiration":1606911117013,                               -- 失效时间  毫秒
         * "token_type":"bearer",
         * "refresh_token":null,
         * "scope":[
         * "read",
         * "write"
         * ]
         * }
         */

        OAuth2AccessToken accessToken = tokenEndpoint.postAccessToken(principal, parameters).getBody();
        Map<String, Object> data = new LinkedHashMap();
        data.put("access_token", accessToken.getValue());
        data.put("token_type", accessToken.getTokenType());
        // data.put("refresh_token", accessToken.getRefreshToken());
        data.put("expiration", accessToken.getExpiresIn() * 1000 + System.currentTimeMillis());
        data.put("scope", accessToken.getScope());
        data.put("additionalInformation", accessToken.getAdditionalInformation());

        if (accessToken.getRefreshToken() != null) {
            data.put("refreshToken", accessToken.getRefreshToken().getValue());
        }
        return new DataRtn(data);
    }


    @PreAuthorize("hasAuthority('admin')")
    @GetMapping("/admin/hello")
    public String helloAdmin() {
        return "Hello,Admin!";
    }

    @PreAuthorize("hasAuthority('user')")
    @GetMapping("/user/hello")
    public String helloUser() {
        return "Hello,User!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello!";
    }
}
