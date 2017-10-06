package com.asaahs.amikomapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    String msg = "--Amikom App : ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText usr = (EditText)findViewById(R.id.usr);
        final EditText psw = (EditText)findViewById(R.id.psw);
        button login = (Button)findViewById(R.id.btn_login);

        login.setOnClickListener(new )

        Log.d(msg, "The omCreate() event");
    }