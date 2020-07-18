package com.franco.implementationinterface;

import androidx.appcompat.app.AppCompatActivity;
import com.franco.implementationinterface.ButtonOne;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivityOne extends AppCompatActivity implements com.franco.implementationinterface.Toast {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * If i wanted to create an infinit number of classes would be hardwork
         * this can be solved with an interface.
         */

        ButtonOne buttonOne=new ButtonOne();
        buttonOne.setMainActivityOne(this);


    }

    public void onClick(int getViewId){
        /**
         * Handle the event what ever it needs to do.
         */
        makeToast("Button Clicked it worked Yahooo!!!!");
    }

    @Override
    public void makeToast(String message) {
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();


    }
}