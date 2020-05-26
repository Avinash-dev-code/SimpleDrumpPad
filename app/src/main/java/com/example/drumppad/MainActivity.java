package com.example.drumppad;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private SoundPool soundPool;
    int sound1,sound2,sound3,sound4,sound5,sound6,sound7,sound8,sound9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AudioAttributes audioAttributes = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();
            soundPool = new SoundPool.Builder()
                    .setMaxStreams(9)
                    .setAudioAttributes(audioAttributes)
                    .build();
        } else {
            soundPool = new SoundPool(9, AudioManager.STREAM_MUSIC, 0);
        }
        sound1 = soundPool.load(this, R.raw.sound1, 1);
        sound2 = soundPool.load(this, R.raw.sound2, 1);
        sound3 = soundPool.load(this, R.raw.sound3, 1);
        sound4 = soundPool.load(this, R.raw.sound4, 1);
        sound5 = soundPool.load(this, R.raw.sound5, 1);
        sound6 = soundPool.load(this, R.raw.sound6, 1);
        sound7 = soundPool.load(this, R.raw.sound7, 1);
        sound8 = soundPool.load(this, R.raw.sound8, 1);
        sound9 = soundPool.load(this, R.raw.sound9, 1);

    }
    public void playsound(View v) {
        switch (v.getId()) {
            case R.id.b1:
                soundPool.play(sound1, 1, 1, 0, 0, 1);

                break;
            case R.id.b2:
                soundPool.play(sound2, 1, 1, 0, 0, 1);
                break;
            case R.id.b3:
                soundPool.play(sound3, 1, 1, 0, 0, 1);
                break;
            case R.id.b4:
                soundPool.play(sound4, 1, 1, 0, 0, 1);
                break;
            case R.id.b5:
                soundPool.play(sound5, 1, 1, 0, 0, 1);
                break;
            case R.id.b6:
                soundPool.play(sound6, 1, 1, 0, 0, 1);
                break;
            case R.id.b7:
                soundPool.play(sound7, 1, 1, 0, 0, 1);
                break;
            case R.id.b8:
                soundPool.play(sound8, 1, 1, 0, 0, 1);
                break;
            case R.id.b9:
                soundPool.play(sound9, 1, 1, 0, 0, 1);
                break;



        }
    }





    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
}
