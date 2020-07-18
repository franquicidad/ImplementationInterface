package com.franco.implementationinterface;

public class ButtonTwo  {
    //MainActivityTwo mainActivityTwo;

    onWidgetClickListener onWidgetClickListener;

    public void setOnWidgetClickListener(com.franco.implementationinterface.onWidgetClickListener onWidgetClickListener) {
        this.onWidgetClickListener = onWidgetClickListener;
    }

    public ButtonTwo(){

    }




    public int getViewId() {
        return 12345;
    }



    public void onClick() {
        onWidgetClickListener.onClick(getViewId());

    }
}
