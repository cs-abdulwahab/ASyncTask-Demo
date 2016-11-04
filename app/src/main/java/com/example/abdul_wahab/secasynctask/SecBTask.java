package com.example.abdul_wahab.secasynctask;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by Abdul-Wahab on 11/4/2016.
 */

public class SecBTask extends AsyncTask<String, Integer, Boolean> {
    private String TAG = "TAG";
    private Activity context;

     SecBTask(Activity context) {

        this.context = context;
    }


    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        Log.d(TAG, "onPreExecute() called");
    }

    @Override
    protected Boolean doInBackground(String... strings) {

        for (int i = 0; i < strings.length; i++) {

            Log.d("TAG", "doInBackground()  = [" + strings[i] + "]");

            publishProgress(i);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return true;
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);

        //   TextView Update

        TextView txtName = (TextView) context.findViewById(R.id.txtName);
        txtName.setText("string number  " + values[0]);

    }


}
