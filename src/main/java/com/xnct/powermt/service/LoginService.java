package com.xnct.powermt.service;

import com.xnct.powermt.dao.LoginDao;
import com.xnct.powermt.entity.LoginInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/7/18.
 */
@Service
public class LoginService {

    @Autowired
    LoginDao loginDao;

    public LoginInfo queryLogin(String account, String psw){
        Map<String, String> login = new HashMap<>();
        login.put("account", account);
        login.put("psw", psw);
        return loginDao.queryLogin(login);
    }
}
