package com.ours.thecanteen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

    }
    public void Submitted(View view)
    {


        boolean flag=true;
        EditText etUserName = (EditText) findViewById(R.id.Sign_up_name);
        String strUserName = etUserName.getText().toString();

        if(TextUtils.isEmpty(strUserName)) {
            etUserName.setError("User name can't be empty");
            flag=false;
        }
        EditText semester = (EditText) findViewById(R.id.Semester_reg);
        String sem = semester.getText().toString();

        if(TextUtils.isEmpty(sem)) {
            semester.setError("Semester can't be empty");
            flag=false;
        }
       else {
            int temp =0;
            temp=Integer.parseInt(semester.getText().toString());
            if (temp != 1 && temp != 2)
            {
                semester.setError("Invalid Semester");
                flag = false;
            }
        }

        EditText yearinput = (EditText) findViewById(R.id.year_reg);
        String year = yearinput.getText().toString();

        if(TextUtils.isEmpty(year)) {
            yearinput.setError("Year can't be empty");
            flag=false;
        }
        else
        {
            int temp=Integer.valueOf(year);
            if(temp<1 && temp>4)
            {
                yearinput.setError("Invalid Year");
                flag=false;
            }
        }
        EditText mobile_number_input = (EditText) findViewById(R.id.mobile_number_reg);
        String mobile_number = mobile_number_input.getText().toString();

        if(TextUtils.isEmpty(mobile_number)) {
            mobile_number_input.setError("Mobile Number can't be empty");
            flag=false;
        }

        EditText Password = (EditText) findViewById(R.id.password_reg);
        String Password_reg = Password.getText().toString();
        System.out.println(Password_reg);

        if(TextUtils.isEmpty(Password_reg)) {
            Password.setError("Password can't be empty");
            flag=false;
        }

        if(flag==true)
        {




                Toast.makeText(this, "Registration Successfull ", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(SignUpActivity.this, LoginActivity.class));



        }





    }
}
