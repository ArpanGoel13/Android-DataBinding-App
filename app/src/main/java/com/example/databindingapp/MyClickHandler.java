package com.example.databindingapp;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class MyClickHandler {
    Context context;

    public MyClickHandler(Context context) {
        this.context = context;
    }

    public void onButtonClickMethod(View view){
        Toast.makeText(context.getApplicationContext(), "Button Clicked", Toast.LENGTH_LONG).show();
    }
}
