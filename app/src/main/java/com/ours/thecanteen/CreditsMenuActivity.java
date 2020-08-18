package com.ours.thecanteen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class CreditsMenuActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    ArrayList<ModelFood> foodsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits_menu);

        recyclerView = findViewById(R.id.recycler_view);

        foodsList = new ArrayList<>();

        foodsList.add(new ModelFood(R.drawable.sadia,"Sadia Afsana Mumu","2.2","18.01.04.138"));
        foodsList.add(new ModelFood(R.drawable.nusrat,"Nusrat  Khan","2.2","17.02.04.101"));
        foodsList.add(new ModelFood(R.drawable.asfak,"Asfakur Rahman","2.2","16.02.04.032"));



        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        RecyclerView.LayoutManager rvLiLayoutManager = layoutManager;

        recyclerView.setLayoutManager(rvLiLayoutManager);

        CreditAdapter adapter = new CreditAdapter(this,foodsList);

        recyclerView.setAdapter(adapter);

    }
}
