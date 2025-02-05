package com.minhtnn.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginFacebook extends AppCompatActivity {

    private EditText emailEditText, passwordEditText;
    private Button loginButton;
    private TextView signUpText, forgotPasswordText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab1_screen4);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        // Ánh xạ các View
        emailEditText = findViewById(R.id.email);
        passwordEditText = findViewById(R.id.password);
        loginButton = findViewById(R.id.login_button);
        signUpText = findViewById(R.id.sign_up);
        forgotPasswordText = findViewById(R.id.forgot_password);

        // Xử lý sự kiện nút đăng nhập
        loginButton.setOnClickListener(view -> {
            String email = emailEditText.getText().toString().trim();
            String password = passwordEditText.getText().toString().trim();

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(LoginFacebook.this, "Please enter both email and password", Toast.LENGTH_SHORT).show();
            } else {
                // Giả lập đăng nhập thành công
                Toast.makeText(LoginFacebook.this, "Login Successful!", Toast.LENGTH_SHORT).show();
                // Chuyển sang màn hình chính (MainActivity)
                Intent intent = new Intent(LoginFacebook.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // Xử lý sự kiện nhấn vào Sign Up
        signUpText.setOnClickListener(view -> {
            Toast.makeText(LoginFacebook.this, "Redirecting to Sign Up...", Toast.LENGTH_SHORT).show();
        });

        // Xử lý sự kiện nhấn vào Forgot Password
        forgotPasswordText.setOnClickListener(view -> {
            Toast.makeText(LoginFacebook.this, "Redirecting to Forgot Password...", Toast.LENGTH_SHORT).show();
        });
    }
}