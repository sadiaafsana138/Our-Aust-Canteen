package com.ours.thecanteen;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;

public class food_info extends AppCompatActivity{

    String name;

    String price;
    String ID;

    public food_info(String ID, String price,String name ) {
        this.name = name;
        this.price = price;
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public food_info(String name, String price) {
        this.name = name;
        this.price = price;

    }
}
