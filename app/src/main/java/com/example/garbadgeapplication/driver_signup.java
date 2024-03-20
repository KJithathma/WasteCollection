package com.example.garbadgeapplication;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;



public class driver_signup extends AppCompatActivity {

    private EditText editTextEmail;
    private EditText editTextPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_signup);



        editTextEmail = findViewById(R.id.editTextText3);
        editTextPassword = findViewById(R.id.editTextNumber);
        editTextEmail = findViewById(R.id.editTextNumberDecimal);
        editTextPassword = findViewById(R.id.editTextText4);
        editTextEmail = findViewById(R.id.editTextTextEmailAddress);
        Button buttonSignUp = findViewById(R.id.button5);

        buttonSignUp.setOnClickListener(v -> signUpDriver());
    }

    private void signUpDriver() {
        String email = editTextEmail.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();

        if (TextUtils.isEmpty(email)) {
            Toast.makeText(getApplicationContext(), "Enter email address!", Toast.LENGTH_SHORT).show();
            return;
        }

        if (TextUtils.isEmpty(password)) {
            Toast.makeText(getApplicationContext(), "Enter password!", Toast.LENGTH_SHORT).show();
            return;
        }
    }
}


