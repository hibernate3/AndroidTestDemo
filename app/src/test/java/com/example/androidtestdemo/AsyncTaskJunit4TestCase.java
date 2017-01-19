package com.example.androidtestdemo;

import org.junit.Test;

import java.util.concurrent.CountDownLatch;

import static org.junit.Assert.*;

/**
 * Created by wangyuhang on 2017/1/18.
 */
public class AsyncTaskJunit4TestCase {
    @Test(timeout = 10000)
    public void sync_getOnlineConfig() throws Exception {
        assertEquals("value1", new AsyncTask().sync_getOnlineConfig("key1"));
    }

    @Test(timeout = 10000)
    public void async_getOnlineConfig() throws Exception {
        final CountDownLatch signal = new CountDownLatch(1);
        new AsyncTask().async_getOnlineConfig("key1", new AsyncTask.onFinishListener() {
            @Override
            public void onFinish(String key, String value) {
                if ("key1".equals(key)) {
                    assertEquals("value1", value);
                }
                signal.countDown();
            }
        });
        signal.await();
    }
}