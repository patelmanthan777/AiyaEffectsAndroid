package com.aiyaapp.aiya;

import android.app.Application;

/**
 * Created by aiya on 2017/9/21.
 */

public class MainApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
//        LeakCanary.install(this);
    }


}
