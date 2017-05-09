package com.example.android.musicapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        NowPlayingClickListener nowPlayingClickListener = new NowPlayingClickListener(this);

        TextView previousView = (TextView)findViewById(R.id.previousSong);
        previousView.setOnClickListener(nowPlayingClickListener);

        TextView nextView = (TextView)findViewById(R.id.nextSong);
        nextView.setOnClickListener(nowPlayingClickListener);

        TextView progressView = (TextView)findViewById(R.id.progress);
        progressView.setOnClickListener(nowPlayingClickListener);

    }

}
