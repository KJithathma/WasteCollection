//package com.example.garbadgeapplication;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.text.TextUtils;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.Toast;
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;
//
//
//public class User_signup extends AppCompatActivity {
//
//    private EditText editTextEmail;
//    private EditText editTextPassword;
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_user_signup);
//
//
//
//        editTextEmail = findViewById(R.id.);
//        EditText username = findViewById(R.id.editTextText5);
//        EditText id = findViewById(R.id.editTextNumber2);
//        EditText mobileNo = findViewById(R.id.editTextNumber3);
//        EditText homeadress = findViewById(R.id.editTextText6);
//        editTextEmail = findViewById(R.id.editTextTextEmailAddress2);
//        Button buttonSignUp = findViewById(R.id.button6);
//
//        buttonSignUp.setOnClickListener(v -> signUpUser());
//    }
//
//    private void signUpUser() {
//        String username = editTextText5.getText().toString().trim();
//        Number id = editTextNumber2();
//        Number mNo =editTextEmail.getText().toString();
//        String eMali = email.getText().toString();
//        String pwd = password.getText().toString();
//
//
//        if (TextUtils.isEmpty(email)) {
//            Toast.makeText(getApplicationContext(), "Enter email address!", Toast.LENGTH_SHORT).show();
//            return;
//        }
//
//        if (TextUtils.isEmpty(password)) {
//            Toast.makeText(getApplicationContext(), "Enter password!", Toast.LENGTH_SHORT).show();
//            return;
//        }
//    }
//}
