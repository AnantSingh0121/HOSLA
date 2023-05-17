package com.anant.sos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {
    TextView btn;
    private EditText inputUsername, inputPassword, inputEmail, inputConformPassword;
    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btn = findViewById(R.id.alreadyHaveAccount);
        inputUsername=findViewById(R.id.inputUsername);
        inputEmail = findViewById(R.id.inputEmail);
        inputPassword = findViewById(R.id.inputPassword);
        inputConformPassword = findViewById(R.id.inputConformPassword);
        btnRegister = findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkCredentials();
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
            }
        });
    }

    private void checkCredentials() {
        String username = inputUsername.getText().toString();
        String email = inputEmail.getText().toString();
        String password = inputPassword.getText().toString();
        String conformPassword = inputConformPassword.getText().toString();

        if (username.isEmpty() || username.length() < 7) {
            showError(inputUsername, "Your Username is not valid !");
        } else if (email.isEmpty() || !email.contains("@")) {
            showError(inputEmail, "Email Address is not Valid");
        } else if (password.isEmpty() || password.length() < 7) {
            showError(inputPassword, "Password must be 7 character long");
        } else if (conformPassword.isEmpty() || ! conformPassword.equals(password)) {
            showError(inputConformPassword, "Sorry. Password not match !");
        } else {
            Toast.makeText(this, "Registration Successfully !!!", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
        }
    }

    private void showError(EditText input, String s) {
        input.setError(s);
        input.requestFocus();

    }
}