package com.unimib.worldnews;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.card.MaterialCardView;

public class PickCategoriesActivity extends AppCompatActivity {

    public static final String TAG = PickCategoriesActivity.class.getName();
    private MaterialCardView scienceCard;
    private MaterialCardView healthCard;
    private MaterialCardView generalCard;
    private MaterialCardView entertainmentCard;
    private MaterialCardView businessCard;
    private MaterialCardView sportsCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pick_categories);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        scienceCard = findViewById(R.id.science_card);
        healthCard = findViewById(R.id.health_card);
        generalCard = findViewById(R.id.general_card);
        entertainmentCard = findViewById(R.id.entertainment_card);
        businessCard = findViewById(R.id.business_card);
        sportsCard = findViewById(R.id.sports_card);

        scienceCard.setOnClickListener(view -> {
            scienceCard.setChecked(!scienceCard.isChecked());
        });

        healthCard.setOnClickListener(view -> {
            healthCard.setChecked(!healthCard.isChecked());
        });

        generalCard.setOnClickListener(view -> {
            generalCard.setChecked(!generalCard.isChecked());
        });

        entertainmentCard.setOnClickListener(view -> {
            entertainmentCard.setChecked(!entertainmentCard.isChecked());
        });

        businessCard.setOnClickListener(view -> {
            businessCard.setChecked(!businessCard.isChecked());
        });

        sportsCard.setOnClickListener(view -> {
            sportsCard.setChecked(!sportsCard.isChecked());
        });

        Bundle b = new Bundle();

        b.putBoolean("science", scienceCard.isChecked());
        b.putBoolean("health", healthCard.isChecked());

    }
}