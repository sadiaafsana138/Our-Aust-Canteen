package com.ours.thecanteen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

public class SnacksMenuActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    TextView cost;

    ArrayList<ModelFood> foodsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snacks_menu);

        recyclerView = findViewById(R.id.recycler_view);
        cost=(TextView) findViewById(R.id.cost_show);

        foodsList = new ArrayList<>();

        foodsList.add(new ModelFood(R.drawable.burger,"Burger","the Canteen","100"));
        foodsList.add(new ModelFood(R.drawable.sandwich,"Sandwich","The Canteen","80"));
        foodsList.add(new ModelFood(R.drawable.pizza,"Pizza","The Canteen","120"));
        foodsList.add(new ModelFood(R.drawable.singra,"Singra","The Canteen","20"));
        foodsList.add(new ModelFood(R.drawable.sub_sandwich,"Sub Sandwich","The Canteen","50"));


        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        RecyclerView.LayoutManager rvLiLayoutManager = layoutManager;

        recyclerView.setLayoutManager(rvLiLayoutManager);

        FoodAdapter adapter = new FoodAdapter(this,foodsList,cost);

        recyclerView.setAdapter(adapter);

    }
}
