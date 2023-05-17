package com.anant.sos;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    TextView btn;
    EditText inputEmail;
    EditText inputPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);
        btn = findViewById(R.id.textViewSignUp);
        inputEmail = findViewById(R.id.inputEmail);
        inputPassword = findViewById(R.id.inputPassword);
        btnLogin = findViewById(R.id.btnlogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkCredentials();
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            }
        });
    }

    private void checkCredentials() {
        String email = inputEmail.getText().toString();
        String password = inputPassword.getText().toString();

        if (email.isEmpty() || !email.contains("@")) {
            showError(inputEmail, "Email Address is not Valid");
        } else if (password.isEmpty() || password.length() < 7) {
            showError(inputPassword, "Password must be 7 character long");
        } else {
            Toast.makeText(this, "Login Successfully !!!", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, MainActivity2.class));
        }
    }

    private void showError(EditText input, String s) {
        input.setError(s);
        input.requestFocus();

    }
}