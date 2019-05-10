package com.example.myproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {


    private EditText userEmail , UserPassword;
    private Button LoginButton;
    private TextView CreateAnAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userEmail = (EditText)findViewById(R.id.email);
        UserPassword = (EditText)findViewById(R.id.password);
        LoginButton = (Button)findViewById(R.id.login);
        CreateAnAccount = (TextView)findViewById(R.id.register);

        CreateAnAccount.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerintent = new Intent(LoginActivity.this, Register.class);
                startActivity(registerintent);
            }
        });


        LoginButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String email = userEmail.getText().toString();
                String password = UserPassword.getText().toString();

                if (TextUtils.isEmpty(email))
                {
                    Toast.makeText(LoginActivity.this, "Please Enter Email", Toast.LENGTH_SHORT).show();
                }
                if (TextUtils.isEmpty(password))
                {
                    Toast.makeText(LoginActivity.this, "Please Enter Password", Toast.LENGTH_SHORT).show();
                }
                if (email.equals("Admin@gmail.com") && password.equals("1234"))
                {
                    Intent registerintent = new Intent(LoginActivity.this,WellcomeActivity.class);
                    startActivity(registerintent);
                    Toast.makeText(LoginActivity.this, "login successful", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(LoginActivity.this, "Invalid username or password", Toast.LENGTH_SHORT).show();
                    Intent registerintent = new Intent(LoginActivity.this, Register.class);
                    startActivity(registerintent);
                }
            }
        });


    }
}

