package com.example.a216114020myproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Rogister extends AppCompatActivity {

    private EditText userEmail , UserPassword;
    private Button RegisterButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rogister);

        userEmail = (EditText)findViewById(R.id.email);
        UserPassword = (EditText)findViewById(R.id.password);
        RegisterButton = (Button)findViewById(R.id.login);


        RegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String email = userEmail.getText().toString();
                String password = UserPassword.getText().toString();

                if (TextUtils.isEmpty(email))
                {
                    Toast.makeText(Rogister.this, "Please Enter Email", Toast.LENGTH_SHORT).show();
                }
                if (TextUtils.isEmpty(password))
                {
                    Toast.makeText(Rogister.this, "Please Enter Password", Toast.LENGTH_SHORT).show();
                }

                else
                {
                    Toast.makeText(Rogister.this, "Registration successful", Toast.LENGTH_SHORT).show();
                    Intent registerintent = new Intent(Rogister.this,Rogister.class);
                    startActivity(registerintent);
                }
            }
        });
    }
}
