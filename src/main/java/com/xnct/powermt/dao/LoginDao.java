package com.xnct.powermt.dao;

import com.xnct.powermt.entity.LoginInfo;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * Created by Administrator on 2017/7/18.
 */
@Repository
public interface LoginDao {
    LoginInfo queryLogin(Map<String, String> login);
}
