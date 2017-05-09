package com.example.android.musicapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView searchView = (TextView)findViewById(R.id.search);
        searchView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(i);
            }
        });

        NowPlayingClickListener nowPlayingClickListener = new NowPlayingClickListener(this);

        TextView nowPlayingView = (TextView)findViewById(R.id.nowPlayingButton);
        nowPlayingView.setOnClickListener(nowPlayingClickListener);

        TextView progressView = (TextView)findViewById(R.id.progress);
        progressView.setOnClickListener(nowPlayingClickListener);

        TextView librariesView = (TextView)findViewById(R.id.librariesButton);
        librariesView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, LibraryActivity.class);
                startActivity(i);
            }
        });

        TextView discoverView = (TextView)findViewById(R.id.discoverButton);
        discoverView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, DiscoverActivity.class);
                startActivity(i);
            }
        });


    }
}
