package com.example.queenshospital2;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class AppointDoctorActivity extends AppCompatActivity {

    private RecyclerView recyclerViewDoctors;
    private ImageButton buttonFilter;
    private DoctorAdapter doctorAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appoint_doctor);

        // Initialize views
        recyclerViewDoctors = findViewById(R.id.recycler_view_doctors);
        buttonFilter = findViewById(R.id.button_filter);

        // Set up RecyclerView
        setupRecyclerView();

        // Set up Filter button click listener
        buttonFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AppointDoctorActivity.this, "Filter button clicked!", Toast.LENGTH_SHORT).show();
                // Add filter options later
            }
        });
    }

    private void setupRecyclerView() {
        // Create a list of doctors
        List<Doctor> doctorList = new ArrayList<>();
        for (int i = 1; i <= 25; i++) {
            doctorList.add(new Doctor("Doctor " + i, "Specialty " + i, R.drawable.qh_doctor));
        }

        // Set up the adapter and layout manager
        doctorAdapter = new DoctorAdapter(doctorList);
        recyclerViewDoctors.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewDoctors.setAdapter(doctorAdapter);
    }
}
