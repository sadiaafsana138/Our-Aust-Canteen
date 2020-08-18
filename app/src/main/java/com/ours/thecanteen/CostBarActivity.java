package com.ours.thecanteen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CostBarActivity extends AppCompatActivity {


    public static int totalFoodCost;
    TextView cost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cost_bar);
        cost=(TextView)findViewById(R.id.cost_show);
        cost.setText(totalFoodCost);


    }



}
