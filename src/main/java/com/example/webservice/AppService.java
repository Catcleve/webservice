package com.example.webservice;

import com.example.webservice.dao.User;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * @author tj
 * @apiNote
 * @date 2021/8/31
 */
@WebService
public interface AppService {

    @WebMethod
    String getUserName(@WebParam(name = "id") String id) throws UnsupportedEncodingException;
    @WebMethod
    String getUser(String id) throws UnsupportedEncodingException;
}
