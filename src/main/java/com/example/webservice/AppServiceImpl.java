package com.example.webservice;

import com.example.webservice.dao.User;

import javax.jws.WebService;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author tj
 * @apiNote
 * @date 2021/8/31
 */

@WebService(name = "test" ,targetNamespace ="http://webservice.example.com" ,endpointInterface = "com.example.webservice.AppService")
public class AppServiceImpl implements AppService {

    @Override
    public String getUserName(String id) {
        System.out.println("id ================== " + id);
        return "获取名字";
    }

    @Override
    public String getUser(String name) {
        User user1 = new User();
        user1.setId("123");
        user1.setName("haha");
        System.out.println("访问getUser");
        return "访问getUser";
    }
}
