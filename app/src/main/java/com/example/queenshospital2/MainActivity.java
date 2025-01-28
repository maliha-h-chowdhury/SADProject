package com.example.queenshospital2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonPatient = findViewById(R.id.button_patient);
        Button buttonDoctor = findViewById(R.id.button_doctor);

        // Corrected references to 'MainActivity.this'
        buttonPatient.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, PatientActivity.class);
            startActivity(intent);
        });

        buttonDoctor.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, DoctorActivity.class);
            startActivity(intent);
        });
    }
}
