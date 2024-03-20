package com.example.garbadgeapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button pickUpButton = findViewById(R.id.button7);
        Button trackButton = findViewById(R.id.button8);
        Button notificationButton = findViewById(R.id.button9);
        Button recyclingInfoButton = findViewById(R.id.button10);

        pickUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(home.this, "Pick up Date/Schedule", Toast.LENGTH_SHORT).show();
                // Add code to handle pick-up button click
            }
        });

        trackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(home.this, "Track Garbage Truck", Toast.LENGTH_SHORT).show();

            }
        });

        notificationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(home.this, "Special Notification/Alert", Toast.LENGTH_SHORT).show();

            }
        });

        recyclingInfoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(home.this, "Recycling Information", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
