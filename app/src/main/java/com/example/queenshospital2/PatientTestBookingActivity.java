package com.example.queenshospital2;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PatientTestBookingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_test_booking);

        Spinner spinnerTests = findViewById(R.id.spinnerTests);
        Button buttonBookTest = findViewById(R.id.buttonBookTest);

        // Sample data for the spinner
        String[] testOptions = {"Blood Test", "X-Ray", "MRI", "CT Scan", "Urine Test"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, testOptions);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerTests.setAdapter(adapter);

        buttonBookTest.setOnClickListener(v -> {
            String selectedTest = spinnerTests.getSelectedItem().toString();
            Toast.makeText(this, "Booked: " + selectedTest, Toast.LENGTH_SHORT).show();
            // Here you can add code to handle test booking logic
        });
    }
}
