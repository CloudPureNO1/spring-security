package com.hzmdyl.basebaen.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * <p></p>
 * <p></p>
 *
 * @author 王森明
 * @date 2021/6/9 9:24
 * @since 1.0.0
 */
@WebService()
public interface HelloWebService {
    /**
     * ces
     * @param name
     * @return
     */
    @WebMethod
     String hello(@WebParam(name="name") String name);
}
