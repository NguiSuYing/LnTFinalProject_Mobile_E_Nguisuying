package com.example.lntsuying;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText editTextIdBimbel;
    EditText editTextName;
    EditText editTextEmail;
    EditText editTextPassword;
    EditText editTextConfirmPassword;

    Button buttonRegister;

    SharedPreferences preferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        editTextIdBimbel  = findViewById(R.id.editTextIdBimbel);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextName  = findViewById(R.id.editTextName);
        editTextPassword = findViewById(R.id.editTextPassword);
        editTextConfirmPassword=findViewById(R.id.editTextConfirmPassword);
        buttonRegister = findViewById(R.id.buttonRegister);

        preferences = getSharedPreferences("UserInfo", 0);


        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {


                String newIdbimbel = editTextIdBimbel.getText().toString().trim();
                String newEmail = editTextEmail.getText().toString().trim();
                String newName = editTextName.getText().toString().trim();
                String newPassword = editTextPassword.getText().toString().trim();
                String newConfirmPassword = editTextConfirmPassword.getText().toString().trim();

                if (newName.length()>5){
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putString("editTextIdBimbel", newEmail);
                    editor.putString("editTextEmail", newEmail);
                    editor.putString("editTextName", newEmail);
                    editor.putString("editTextPassword", newEmail);
                    editor.putString("editTextConfirmPassword", newEmail);
                    editor.apply();
                    Toast.makeText(RegisterActivity.this, "Registered!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(RegisterActivity.this, "Enter value in the fields!", Toast.LENGTH_SHORT).show();
                }

            });



        });

    public void emptyField(){

            editTextIdBimbel.setText("");
            editTextEmail.setText("");
            editTextName.setText("");
            editTextPassword.setText("");
            editTextConfirmPassword.setText("");
        };

    }






