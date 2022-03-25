package com.huawei.musicplayer;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class Service extends android.app.Service {
    MediaPlayer mp;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    @Override
    public void onCreate() {

        mp = MediaPlayer.create(this,R.raw.song);
    }

    @Override
    public void onStart(Intent intent, int startId) {
        Toast.makeText(this, "Service Started", Toast.LENGTH_LONG).show();
        mp.start();
    }

    @Override
    public void onDestroy() {
        Toast.makeText(this, "Service Stopped", Toast.LENGTH_LONG).show();
        mp.stop();    }
}
