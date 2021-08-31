package com.hzmdyl.oauth.server.test;

import com.hzmdyl.oauth.server.util.SM3Util;
import lombok.extern.slf4j.Slf4j;

import java.text.SimpleDateFormat;
import java.util.Date;

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

        long time = 1619694884131L;

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");

        String sDate = simpleDateFormat.format(new Date(time));

        log.info("时间：{}", sDate);


    }
}
