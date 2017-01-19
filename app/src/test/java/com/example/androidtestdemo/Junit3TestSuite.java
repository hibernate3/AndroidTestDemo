package com.example.androidtestdemo;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Created by wangyuhang on 2017/1/18.
 */

public class Junit3TestSuite extends TestSuite {
    public static Test suite() {
        TestSuite suite = new TestSuite();

        // 将测试的类加入进来
        suite.addTestSuite(AsyncTaskJunit3TestCase.class);

        return suite;
    }
}
