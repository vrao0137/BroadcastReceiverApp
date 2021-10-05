package com.example.broadcastreceiverapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
      // Log.e("","MyBroadcastReceiver:- "+intent.getStringExtra("privateMessage"));
        Toast.makeText(context, "Broadcast message is received:- "+intent.getStringExtra("privateMessage"), Toast.LENGTH_SHORT).show();
    }
}