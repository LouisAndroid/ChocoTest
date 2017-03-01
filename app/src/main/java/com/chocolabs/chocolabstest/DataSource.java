package com.chocolabs.chocolabstest;

import android.os.Handler;
import android.os.HandlerThread;

/**
 * Created by Louis on 2017/3/1.
 */

public class DataSource {
    private String data = "Get data fail";
    private String adapterData = "  {\n" +
            "    \"title\": \"ChocoTestV1\",\n" +
            "    \"sectionType\":\"multiple\",\n" +
            "    \"types\": [\n" +
            "      {\n" +
            "        \"typeName\": \"test1\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"typeName\": \"test2\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"typeName\": \"test3\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"typeName\": \"test4\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"typeName\": \"test5\"\n" +
            "      }\n" +
            "    ]\n" +
            "  }";

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

    //TODO
    public String getAdapterData() {
        return adapterData;
    }
}
