package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.os.Build.VERSION_CODES.M;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        NowPlayingClickListener nowPlayingClickListener = new NowPlayingClickListener(this);

        TextView progressView = (TextView)findViewById(R.id.progress);
        progressView.setOnClickListener(nowPlayingClickListener);
    }
}
