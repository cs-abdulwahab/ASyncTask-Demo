package com.example.abdul_wahab.secasynctask;

import android.os.AsyncTask;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.txtName);
        // some Useful Task
        textView.setText("Counter......");

        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder()
                .detectAll()
                .penaltyLog()
                .penaltyDialog()
                .build());
        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().detectAll()
                .penaltyLog()
                .build());
        


    }

    void btnTest(View view) {
        SecBTask secBTask = new SecBTask(this);
        secBTask.execute("abc", "pqr", "xyz","abc", "pqr", "xyz","abc", "pqr", "xyz","abc", "pqr", "xyz");

    }

}
