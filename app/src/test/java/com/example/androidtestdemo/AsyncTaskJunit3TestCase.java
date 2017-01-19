package com.example.androidtestdemo;

import junit.framework.TestCase;

import java.util.concurrent.CountDownLatch;

/**
 * Created by wangyuhang on 2017/1/18.
 */
public class AsyncTaskJunit3TestCase extends TestCase {
    public void testSync_getOnlineConfig() throws Exception {
        assertEquals("value1", new AsyncTask().sync_getOnlineConfig("key1"));
    }

    public void testAsync_getOnlineConfig() throws Exception {
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