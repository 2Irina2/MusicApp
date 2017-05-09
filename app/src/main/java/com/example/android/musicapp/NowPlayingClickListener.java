package com.example.android.musicapp;

import android.content.Context;
import android.content.Intent;
import android.view.View;

/**
 * Created by irina on 09.05.2017.
 */

public class NowPlayingClickListener implements View.OnClickListener{

    Context context;

    public NowPlayingClickListener(Context context) {
        this.context = context;
    }

    @Override
    public void onClick(View view){
        Intent i = new Intent(context, NowPlayingActivity.class);
        context.startActivity(i);
    }
}
