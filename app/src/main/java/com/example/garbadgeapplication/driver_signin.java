package com.example.garbadgeapplication;


import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


public class driver_signin  extends AppCompatActivity {

    private EditText editTextEmail;
    private EditText editTextPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_signin);



        editTextEmail = findViewById(R.id.editTextText);
        editTextPassword = findViewById(R.id.editTextTextPassword);
        Button buttonSignIn = findViewById(R.id.button3);

        buttonSignIn.setOnClickListener(v -> signInDriver());
    }

    private void signInDriver() {
        String email = editTextEmail.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();

        if (TextUtils.isEmpty(email)) {
            Toast.makeText(getApplicationContext(), "Enter email address!", Toast.LENGTH_SHORT).show();

        }

        if (TextUtils.isEmpty(password)) {
            Toast.makeText(getApplicationContext(), "Enter password!", Toast.LENGTH_SHORT).show();

        }
    }
}


