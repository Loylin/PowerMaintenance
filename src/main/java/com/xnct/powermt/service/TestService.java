package com.xnct.powermt.service;

import com.xnct.powermt.dao.TestDao;
import com.xnct.powermt.entity.TestUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/7/17.
 */

@Service
public class TestService {

    @Autowired
    TestDao testDao;

    public TestUser queryTest(String id, String name){
        Map<String, String> testinfo = new HashMap<>();
        testinfo.put("id", id);
        testinfo.put("name", name);
        return testDao.queryTest(testinfo);
    }
}
