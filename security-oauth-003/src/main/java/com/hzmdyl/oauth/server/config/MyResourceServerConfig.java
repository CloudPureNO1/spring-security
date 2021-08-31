package com.hzmdyl.oauth.server.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

/**
 * <p></p>
 * <p></p>
 *
 * @author 王森明
 * @date 2021/4/28 17:12
 * @since 1.0.0
 */
@Configuration
@EnableResourceServer
public class MyResourceServerConfig extends ResourceServerConfigurerAdapter {

    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
        resources.resourceId("rid");
    }

    /**
     * 这里设置需要token验证的url
     * 可以在WebSecurityConfigurerAdapter中排除掉，
     * 对于相同的url，如果二者都配置了验证
     * 则优先进入ResourceServerConfigurerAdapter,进行token验证。而不会进行
     * WebSecurityConfigurerAdapter 的 basic auth或表单认证。
     */
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                /**
                 * 对资源的权限判断应该动态的放在元数据中判断，
                 * 对于方法访问权限  @EnableGlobalMethodSecurity(prePostEnabled = true)  // 可以进行方法校验  校验资源权限
                 * 配合  @PreAuthorize("hasAuthority('admin')")   使用
                 */
                /*              .antMatchers("/admin/**").hasRole("admin")
                              .antMatchers("/user/**").hasRole("user")*/
                .anyRequest().authenticated();
    }
}
