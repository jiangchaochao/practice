package com.lyl.pluginmanage.hookv;

import android.app.Application;
import android.os.Message;

import com.lyl.pluginmanage.IAndroidHook;

//api 21-25
public class Android5_7Hook implements IAndroidHook {
    @Override
    public void hookAms(Application application) throws Exception {

    }

    @Override
    public void hookActivityThread(Application application) throws Exception {

    }

    @Override
    public boolean handleMessage(Message msg) {
        return false;
    }
}
