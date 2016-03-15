package com.example.android.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by abhibit on 12-01-2016.
 */
public class broadcast extends BroadcastReceiver{


    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"heloo",Toast.LENGTH_SHORT).show();
    }
}