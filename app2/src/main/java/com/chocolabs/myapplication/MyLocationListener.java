package com.chocolabs.myapplication;

import android.os.Handler;
import android.os.HandlerThread;

/**
 * Created by Louis on 2017/6/28.
 */

public class MyLocationListener {


    private Handler handler;
    private OnLocationChangeListener onLocationChangeListener;

    public interface OnLocationChangeListener {
        void onChange(String message);
    }


    public MyLocationListener(OnLocationChangeListener onLocationChangeListener) {
        this.onLocationChangeListener = onLocationChangeListener;
        handler = new Handler();
    }

    public void start() {
        HandlerThread handlerThread = new HandlerThread("Test Thread");
        handler = new Handler(handlerThread.getLooper());
        handler.postDelayed(runnable, 5000);
    }

    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            onLocationChangeListener.onChange("Hello word got location");
        }
    };


    public void stop() {
        handler.removeCallbacks(runnable);
    }
}
