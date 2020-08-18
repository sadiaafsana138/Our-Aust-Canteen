package com.ours.thecanteen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.ours.thecanteen.R;

import java.util.ArrayList;

import Database.DatabaseHelper;

public class BreakfastMenuActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    TextView cost;

    ArrayList<ModelFood> foodsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast_menu);

        cost=(TextView) findViewById(R.id.cost_show);
        recyclerView = findViewById(R.id.recycler_view);

        foodsList = new ArrayList<>();
        final DatabaseHelper db= new DatabaseHelper(this);
        final String datbasename="food";
       // ArrayList<food_info> myContactList = db.getAllContact(datbasename);

        foodsList.add(new ModelFood(R.drawable.dal_vaji,"Dal Vaji","The Canteen","50"));
        foodsList.add(new ModelFood(R.drawable.paratha,"Paratha","The Canteen","50"));
        foodsList.add(new ModelFood(R.drawable.egg_rool,"Egg Roll","The Canteen","30"));
        foodsList.add(new ModelFood(R.drawable.egg,"Egg","The Canteen","20"));
        foodsList.add(new ModelFood(R.drawable.egg_chop,"Egg Chop","The Canteen","50"));
        /*for(food_info myContact : myContactList)
        {
            int image=myContact.item_image;
            foodsList.add(new ModelFood(R.drawable.image,myContact.getName(),myContact.getPlace(),myContact.getPrice()));
        }*/


        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        RecyclerView.LayoutManager rvLiLayoutManager = layoutManager;

        recyclerView.setLayoutManager(rvLiLayoutManager);

        FoodAdapter adapter = new FoodAdapter(this,foodsList,cost);

        recyclerView.setAdapter(adapter);

    }
}
