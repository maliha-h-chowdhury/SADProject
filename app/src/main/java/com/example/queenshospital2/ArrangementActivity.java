package com.example.queenshospital2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ArrangementActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arrangement);

        // Get references to buttons
        Button bookTestButton = findViewById(R.id.button_book_test);
        Button appointDoctorButton = findViewById(R.id.button_appoint_doctor);

        // Set onClick listeners
        bookTestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to BookTestActivity
                Intent intent = new Intent(ArrangementActivity.this, PatientTestBookingActivity.class);
                startActivity(intent);
            }
        });

        appointDoctorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to AppointDoctorActivity
                Intent intent = new Intent(ArrangementActivity.this, AppointDoctorActivity.class);
                startActivity(intent);
            }
        });
    }
}
