package com.example.android.musicapp;

import android.content.Intent;
import android.view.View;

import static android.R.attr.start;

/**
 * Created by irina on 07.05.2017.
 */

public class NowPlayingClickListener implements View.OnClickListener{
    @Override
    public void onClick(View view){
        Intent i = new Intent(MainActivity.this, NowPlayingActivity.class);
        startActivity(i);
    }
}
