package com.xnct.powermt.controller;

import com.xnct.powermt.entity.TestUser;
import com.xnct.powermt.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/7/17.
 */

@Controller
public class Test {

    @Autowired
    TestService testService;

    @RequestMapping("/test")
    public String test(String id, String name){
        System.out.println("您输入的id为：" + id + "  姓名：" + name);
        TestUser testUser = testService.queryTest(id, name);
        System.out.println(testUser.getId() + " " + testUser.getName());
        return "test";
    }
}
