package com.franco.implementationinterface;

public class ButtonOne {
    MainActivityOne mainActivityOne;


    public void setMainActivityOne(MainActivityOne mainActivityOne) {
        this.mainActivityOne = mainActivityOne;
    }

    public ButtonOne(){

    }


    public void onClick(int getId) {
        mainActivityOne.onClick(getViewId());
    }


    public int getViewId() {
        return 12345;
    }


}
