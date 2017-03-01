package com.chocolabs.chocolabstest;

import android.os.Handler;
import android.os.HandlerThread;

/**
 * Created by Louis on 2017/3/1.
 */

public class DataSource {
    private String data = "Get data fail";
    private String adapterData;

    public interface OnDataLoaded {
        void done();

        void fail();
    }

    public DataSource(final OnDataLoaded onDataLoaded) {
        HandlerThread handlerThread = new HandlerThread("TestObject");
        handlerThread.start();
        new Handler(handlerThread.getLooper())
                .postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            data = "Get Data success";
                            onDataLoaded.done();
                        } catch (Exception e) {
                            onDataLoaded.fail();
                        }

                    }
                }, 3000);
    }

    //TODO
    public String getData() {
        return data;
    }

    public void setAdapterData(String adapterData) {
        this.adapterData = adapterData;
    }

    public String getAdapterData() {
        return adapterData;
    }
}
