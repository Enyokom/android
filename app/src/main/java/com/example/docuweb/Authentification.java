package com.example.docuweb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Authentication extends AppCompatActivity implements View.OnClickListener {

    androidx.cardview.widget.CardView login;
    TextView loginTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        login = (androidx.cardview.widget.CardView) findViewById(R.id.login);
        loginTxt = (TextView) findViewById(R.id.loginTxt);
        login.setOnClickListener(this);
        loginTxt.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.login:
                Toast.makeText(getApplicationContext(), "Password submissed", Toast.LENGTH_SHORT).show();
                break;
            case R.id.loginTxt:
                Intent i = new Intent(this,Dashboard.class);
                startActivity(i);
        }
    }
}