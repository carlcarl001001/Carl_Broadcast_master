package com.example.carl.carl_broadcast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSendNormalBC(View view) {
        Intent intent = new Intent("com.example.carl.carl_broadcastreceiver.MyReceiver1.action");
        intent.putExtra("action","2efsdf");
        sendBroadcast(intent);
        Toast.makeText(this,"发送一般广播",Toast.LENGTH_LONG).show();
    }

    public void onSendOrderBC(View view) {
        Intent intent = new Intent("com.example.carl.carl_broadcastreceiver.MyReceiver.action2");
        intent.putExtra("action","xxxdsfs");
        sendOrderedBroadcast(intent,null);
        Toast.makeText(this,"发送有序广播",Toast.LENGTH_LONG).show();
    }
}
