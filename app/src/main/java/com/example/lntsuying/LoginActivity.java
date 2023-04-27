package com.example.lntsuying;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.content.SharedPreferences;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

//    private static final android.R.attr R = ;
    EditText editTextEmail, editTextPassword;
    Button buttonLogin;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);

        preferences = getSharedPreferences("UserInfo", 0);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String registeredEmail = preferences.getString("Email", "");
                String registeredPassword = preferences.getString("Password", "");

                if (editTextEmail.equals("registeredEmail") && editTextPassword.equals("registeredPassword ")) {
                    Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(LoginActivity.this, "Invalid login credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });


//
//
//    public void Login(View view) {
//        String email = editTextEmail.getText().toString();
//        String password = editTextPassword.getText().toString();
//
//        if(email.equals("email") && password.equals("password")) {
//            Intent intent = new Intent(this, HomeActivity.class);
//            startActivity(intent);
//        } else {
//            Toast.makeText(this, "Invalid login credentials", Toast.LENGTH_SHORT).show();
//        }
//    }

    }
}