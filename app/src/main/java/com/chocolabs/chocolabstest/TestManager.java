package com.chocolabs.chocolabstest;

/**
 * Created by Louis on 2017/3/1.
 */
//TODO try to optimization
public class TestManager {

    private static TestManager instance = null;
    private DataSource dataSource;

    public static TestManager getInstance() {
        if (instance == null) {
            instance = new TestManager();
        }
        return instance;
    }

    private TestManager() {
        init();
    }


    private void init() {
        dataSource = new DataSource(new DataSource.OnDataLoaded() {
            //I have to know request done or fail
            @Override
            public void done() {
                //do something
            }

            @Override
            public void fail() {
                //do something
            }
        });
    }

    //TODO
    public String getData() {
        return dataSource.getData();
    }

}
