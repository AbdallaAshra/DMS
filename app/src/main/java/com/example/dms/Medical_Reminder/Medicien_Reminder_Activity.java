package com.example.dms.Medical_Reminder;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.example.dms.R;

import android.os.Bundle;

public class Medicien_Reminder_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicien_reminder);
        ActionBar actionbar = getSupportActionBar();
        actionbar.hide();
    }
}