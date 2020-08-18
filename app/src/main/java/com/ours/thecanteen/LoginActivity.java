package com.ours.thecanteen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void LunchoptionMenu(View view)
    {
        String tempID="sadia";

        String defult_password="mumu138";







        boolean flag=true;

        EditText etUserName = (EditText) findViewById(R.id.Username_Input);
        String strUserName = etUserName.getText().toString();
        if(TextUtils.isEmpty(strUserName)) {
            etUserName.setError("User name can't be empty");

        }



        EditText Password = (EditText) findViewById(R.id.password_login);
        String Password_login = Password.getText().toString();
        if(TextUtils.isEmpty(Password_login)) {
            Password.setError("Password can't be empty");

        }



        if(Password_login.equals(defult_password) && strUserName.equals(tempID) )
        {

            startActivity(new Intent(LoginActivity.this, OptionActivity.class));

        }
        else
        {

            Toast.makeText(this, "INVALID ID and Password Combination ", Toast.LENGTH_SHORT).show();


        }
    }
    public void LunchSignUpMenu(View view)
    {
        startActivity(new Intent(LoginActivity.this, SignUpActivity.class));
    }
}
