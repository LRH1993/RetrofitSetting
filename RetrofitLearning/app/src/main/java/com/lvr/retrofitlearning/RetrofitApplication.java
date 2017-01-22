package com.lvr.retrofitlearning;

import android.app.Application;
import android.content.Context;

/**
 * Created by lvr on 2017/1/22.
 */

public class RetrofitApplication extends Application {
    private static RetrofitApplication application;

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
    }

    private RetrofitApplication getApplication(){
        return application;
    }
    public static Context getContext(){
        return  application.getApplicationContext();
    }

}
