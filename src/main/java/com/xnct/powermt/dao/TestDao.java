package com.xnct.powermt.dao;

import com.xnct.powermt.entity.TestUser;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * Created by Administrator on 2017/7/17.
 */
@Repository
public interface TestDao {
    TestUser queryTest(Map<String, String> testinfo);
}
