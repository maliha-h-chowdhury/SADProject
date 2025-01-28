package com.example.queenshospital2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class PatientActivity extends AppCompatActivity {

    private EditText editTextUsername;
    private EditText editTextPassword;
    private Button buttonLogin;
    private Button buttonRegisterPatient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient);

        // Initialize views
        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);
        buttonRegisterPatient = findViewById(R.id.buttonRegisterPatient);

        // Set click listener for Login button
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = editTextUsername.getText().toString().trim();
                String password = editTextPassword.getText().toString().trim();

                if (username.isEmpty() || password.isEmpty()) {
                    Toast.makeText(PatientActivity.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                } else {
                    // Add authentication logic here (e.g., validate with a database or API)
                    Toast.makeText(PatientActivity.this, "Login successful!", Toast.LENGTH_SHORT).show();

                    // Navigate to the next activity (if needed)
                    // Example: Redirect to a Patient Dashboard
                    Intent intent = new Intent(PatientActivity.this, ArrangementActivity.class);
                    startActivity(intent);
                }
            }
        });

        // Set click listener for Register button
        buttonRegisterPatient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the Register Activity
                Intent intent = new Intent(PatientActivity.this, PatientRegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}
