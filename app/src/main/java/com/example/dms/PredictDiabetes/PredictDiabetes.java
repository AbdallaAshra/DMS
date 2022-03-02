package com.example.dms.PredictDiabetes;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.example.dms.R;

public class PredictDiabetes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);
        ActionBar actionbar = getSupportActionBar();
        actionbar.hide();
    }
}