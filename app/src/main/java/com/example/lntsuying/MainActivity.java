package com.example.lntsuying;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button buttonLogin;
    private Button buttonRegister;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editTextEmail= (EditText) findViewById(R.id.editTextEmail);
        final EditText editTextPassword= (EditText) findViewById(R.id.editTextPassword);
        Button buttonLogin =(Button) findViewById(R.id.buttonLogin);
        Button buttonRegister =(Button) findViewById(R.id.buttonRegister);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LoginActivity = new Intent (MainActivity.this, com.example.lntsuying.LoginActivity);
                startActivity(com.example.lntsuying.LoginActivity);
            }

        });

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent RegisterActivity = new Intent (MainActivity.this,
                        com.example.lntsuying.RegisterActivity);
                startActivity(com.example.lntsuying.RegisterActivity);
            }
        });
    }
}