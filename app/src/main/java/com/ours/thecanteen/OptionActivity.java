package com.ours.thecanteen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.ours.thecanteen.BreakfastMenuActivity;
import com.ours.thecanteen.CartMenuActivity;
import com.ours.thecanteen.CreditsMenuActivity;
import com.ours.thecanteen.DrinksMenuActivity;
import com.ours.thecanteen.LunchMenuActivity;
import com.ours.thecanteen.R;

public class OptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);
    }
    public void LunchBreakfastMenu(View view)
    {
        startActivity(new Intent(OptionActivity.this, BreakfastMenuActivity.class));
    }
    public void LunchSnackMenu(View view)
    {
        startActivity(new Intent(OptionActivity.this, SnacksMenuActivity.class));
    }
    public void LunchLunchMenu(View view)
    {
        startActivity(new Intent(OptionActivity.this,  LunchMenuActivity.class));
    }
    public void LunchDrinksMenu(View view)
    {
        startActivity(new Intent(OptionActivity.this, DrinksMenuActivity.class));
    }
    public void LunchCartMenu(View view)
    {
        startActivity(new Intent(OptionActivity.this, CartMenuActivity.class));
    }
    public void LunchCreditMenu(View view)
    {
        startActivity(new Intent(OptionActivity.this, CreditsMenuActivity.class));
    }
}
