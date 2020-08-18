package com.ours.thecanteen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {

    Button student;
    Animation uptodown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        student = (Button)findViewById(R.id.student_login);

        uptodown = AnimationUtils.loadAnimation(this,R.anim.uptodown);
        student.setAnimation(uptodown);

    }


    public void LunchLoginMenu(View view)
    {
       startActivity(new Intent(StartActivity.this,LoginActivity.class));
    }




}
