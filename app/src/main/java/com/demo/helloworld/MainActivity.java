package com.demo.helloworld;

import android.os.Bundle;
import android.util.Log;

import android.app.Activity;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    private static String TAG = "MainActivity";

    private EditText etName;
    private TextView tvHello;

    public void onSayHi(android.view.View view) {
        tvHello.setText("Hello " + etName.getText());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        tvHello = findViewById(R.id.tvHello);

        Log.d(TAG, "onCreate, the activity class is initialized");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart, the activity is started");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart, the activity is restarted");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume, activity is visible");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause, another activity came to the foreground");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop, the activity is not visible");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy, the activity class is destroyed");
    }
}
