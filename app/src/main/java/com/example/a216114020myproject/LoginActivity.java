package com.example.a216114020myproject;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.app.LoaderManager.LoaderCallbacks;

import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;

import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.Manifest.permission.READ_CONTACTS;

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
                Intent registerintent = new Intent(LoginActivity.this,Rogister.class);
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
                    Intent registerintent = new Intent(LoginActivity.this,Rogister.class);
                    startActivity(registerintent);
                }
            }
        });


    }
}

