package com.udacity.gradle.builditbigger;

import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;
import android.text.TextUtils;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.fail;

/**
 * Created by anky_ on 10/01/2017.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class EndpointsAsyncTaskTest implements OnTaskCompleted {

    @Test
    public void test() throws Throwable {

        try {
            EndpointsAsyncTask task = new EndpointsAsyncTask(this);
            task.execute();
            String joke = task.get(30, TimeUnit.SECONDS);
            assertNotNull(joke);
            assertFalse(TextUtils.isEmpty(joke));
        } catch (Exception e) {
            fail("Timed out");
        }
    }

    @Override
    public void onTaskCompleted(String result) {

    }
}
