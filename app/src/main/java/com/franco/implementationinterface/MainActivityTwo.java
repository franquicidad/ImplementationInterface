package com.franco.implementationinterface;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityTwo extends AppCompatActivity implements com.franco.implementationinterface.Toast,onWidgetClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButtonTwo buttonTwo=new ButtonTwo();
        buttonTwo.setOnWidgetClickListener(this);


    }



    @Override
    public void makeToast(String message) {
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();


    }

    @Override
    public void onClick(int getViewId) {

    }
}