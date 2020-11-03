package com.didahdx.dagger2sample;

import android.util.Log;

import javax.inject.Inject;

public class Remote {
    private static final String TAG = "Remote";

    @Inject
    public Remote() {
    }

    public void setRemoteListener(Car car) {
        Log.d(TAG, "setRemoteListener: remote connected");
    }

}