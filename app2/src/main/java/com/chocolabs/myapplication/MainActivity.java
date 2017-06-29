package com.chocolabs.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private MyLocationListener myLocationListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myLocationListener = new MyLocationListener(new MyLocationListener.OnLocationChangeListener() {
            @Override
            public void onChange(String message) {
                textView.setText(message);
            }
        });
        AdvertisingIdClient.Info adInfo = AdvertisingIdClient.getAdvertisingIdInfo(getBaseContext());
    }

    @Override
    protected void onStart() {
        super.onStart();
        Utils.checkUserStatus(new Utils.OnUserStatusCheckListener() {
            @Override
            public void onStateChange(boolean isConnect) {
                if (isConnect) {
                    myLocationListener.start();
                }
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        myLocationListener.stop();
    }
}
