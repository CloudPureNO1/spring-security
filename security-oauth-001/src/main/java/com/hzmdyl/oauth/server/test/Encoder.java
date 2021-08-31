package com.hzmdyl.oauth.server.test;

import com.hzmdyl.oauth.server.util.SM3Util;
import lombok.extern.slf4j.Slf4j;

/**
 * <p></p>
 * <p></p>
 *
 * @author 王森明
 * @date 2021/4/29 14:42
 * @since 1.0.0
 */
@Slf4j
public class Encoder {
    public static void main(String[] args) {
        log.info("123456 的密文为：{}", SM3Util.encode("123456"));
    }
}
