package com.arush.android.pafinal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class BroadcastReceiverActivity extends AppCompatActivity {

    TextView textView;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast_receiver);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        textView = (TextView) findViewById(R.id.textView2);

    }

    BroadcastReceiver myReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            count++;
            String s = "onReceive: count = " + count + "\n" + intent.getAction();
            textView.setText(s);
        }
    };

    IntentFilter myFilter = new IntentFilter(Intent.ACTION_TIME_TICK);

    public void doRegister(View view) {
        Toast.makeText(this, "Count will update now", Toast.LENGTH_LONG).show();
        registerReceiver(myReceiver, myFilter);
    }

    public void doUnregister(View view) {
        Toast.makeText(this, "Count will not update any further", Toast.LENGTH_LONG).show();
        unregisterReceiver(myReceiver);
    }

    public void doBack(View view) {
        setResult(RESULT_OK);
        finish();
    }
}
