package com.chocolabs.myapplication;

import android.os.Handler;

/**
 * Created by Louis on 2017/6/28.
 */

class Utils {

    interface OnUserStatusCheckListener {
        void onStateChange(boolean isConnect);
    }

    static void checkUserStatus(final OnUserStatusCheckListener onUserStatusCheckListener) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                onUserStatusCheckListener.onStateChange(true);
            }
        }, 5000);
    }
}
