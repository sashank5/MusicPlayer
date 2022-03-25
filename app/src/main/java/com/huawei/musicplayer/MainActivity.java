package com.huawei.musicplayer;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.io.IOException;
public class MainActivity extends AppCompatActivity {

    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start(View view) {
        startService(new Intent(this, Service.class));
    }


    public void stop(View view) {
        stopService(new Intent(this, Service.class));
    }
}