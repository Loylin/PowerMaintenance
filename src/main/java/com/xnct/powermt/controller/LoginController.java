package com.xnct.powermt.controller;

import com.xnct.powermt.entity.LoginInfo;
import com.xnct.powermt.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/7/18.
 */
@Controller
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping(value = "/login", method = {RequestMethod.GET, RequestMethod.POST})
    public @ResponseBody String login(String account, String psw){
        //检查
        if(account == null || account.length() == 0 || psw == null || psw.length() == 0)
            return "NO";
        System.out.println("您的账户为:" + account + ", 密码:" + psw);
        LoginInfo loginInfo = loginService.queryLogin(account, psw);
        if (null == loginInfo)
            return "NO";
        System.out.println("姓名:" + loginInfo.getName() + ", 部门:" + loginInfo.getDept());
        return "YES";
    }

    @RequestMapping("/home")
    public String home(){

        return "home";
    }
}
