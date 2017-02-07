package com.techpenta.testasynctask;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

/**
 * Created by Snikdha on 2/7/2017.
 */

public class MyAsynctask extends AsyncTask<Void,Integer,String> {

    Context context;

    ProgressDialog progressDialog;

    public  MyAsynctask(Context ct)
    {
        context=ct;
    }
    @Override
    protected void onPreExecute() {

       progressDialog=new ProgressDialog(context);
        progressDialog.setMessage("Downloading");
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.show();
    }




    @Override
    protected String doInBackground(Void... voids) {


        for(int i=1;i<=10;i++){

            try {
                Thread.sleep(3000);
                publishProgress(i);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        return "succsess";
    }
    @Override
    protected void onProgressUpdate(Integer... values) {
        int value= values[0];
        progressDialog.setProgress(value);
    }

    @Override
    protected void onPostExecute(String s) {
        Toast.makeText(context, "working"+s, Toast.LENGTH_SHORT).show();
    }
}
