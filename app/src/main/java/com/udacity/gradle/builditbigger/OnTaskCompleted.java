package com.udacity.gradle.builditbigger;

/**
 * Created by anky_ on 9/01/2017.
 */

// Interface to let AsyncTask talk to MainActivity
public interface OnTaskCompleted {
    void onTaskCompleted(String result);
}
