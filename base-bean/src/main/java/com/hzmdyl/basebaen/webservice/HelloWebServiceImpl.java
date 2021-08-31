package com.hzmdyl.basebaen.webservice;

import org.springframework.context.annotation.Configuration;

import javax.jws.WebService;

/**
 * <p></p>
 * <p></p>
 *
 * @author 王森明
 * @date 2021/6/9 9:26
 * @since 1.0.0
 */
@WebService(
        targetNamespace = "demo.example.com", //wsdl命名空间
        serviceName = "HelloWebService",                 //portType名称 客户端生成代码时 为接口名称
        endpointInterface = "com.hzmdyl.basebaen.webservice.HelloWebService")//指定发布webservcie的接口类，此类也需要接入@WebService注解
@Configuration
public class HelloWebServiceImpl implements HelloWebService{
    @Override
    public String hello(String name) {
        System.out.println("欢迎你"+name);
        return "欢迎你"+name;
    }
}
