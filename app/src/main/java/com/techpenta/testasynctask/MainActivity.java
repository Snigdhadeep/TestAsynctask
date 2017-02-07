package com.techpenta.testasynctask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MyAsynctask myAsynctask;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myAsynctask=new MyAsynctask(this);
        myAsynctask.execute();
    }


}
