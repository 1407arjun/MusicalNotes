package com.example.musicalnotes;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import com.example.musicalnotes.R;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = new MediaPlayer();

    }

    public void playSound(View view){
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }
        int id = view.getId();
        String ourId = view.getResources().getResourceEntryName(id);
        int resourceId = getResources().getIdentifier(ourId, "raw", "com.example.musicalnotes");
        mediaPlayer = MediaPlayer.create(this, resourceId);
        mediaPlayer.start();
    }
}