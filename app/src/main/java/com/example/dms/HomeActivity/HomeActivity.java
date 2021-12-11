package com.example.dms.HomeActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.dms.Article.ArticalActivity;
import com.example.dms.CheckActivity.CheckActivity;
import com.example.dms.Meal_Suggestion.Suggest_meal_Activity;
import com.example.dms.Medical_Reminder.Medicien_Reminder_Activity;
import com.example.dms.R;
import com.example.dms.profile.ProfileAcitvity;

public class HomeActivity extends AppCompatActivity  {
    LinearLayout artical ,profile, meal,medicinereminder,check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        /*----------- take an  objcet form the liner layout ----------*/
         artical=findViewById(R.id.artical);
         profile=findViewById(R.id.profile);
         meal=findViewById(R.id.meal);
         medicinereminder=findViewById(R.id.medicianReminder);
         check=findViewById(R.id.check);

         /*------------- Make an setOnClickListener ----------------*/
        artical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(HomeActivity.this, ArticalActivity.class);
                startActivity(i);
            }
        });
        meal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(HomeActivity.this, Suggest_meal_Activity.class);
                startActivity(i);            }
        });
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent i=new Intent(HomeActivity.this, ProfileAcitvity.class);
                    startActivity(i);
            }
        });
        medicinereminder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this, Medicien_Reminder_Activity.class);
                startActivity(i);
            }
        });
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(HomeActivity.this, CheckActivity.class);
            startActivity(i);
            }
        });


    }


}