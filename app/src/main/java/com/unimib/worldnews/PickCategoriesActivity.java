package com.unimib.worldnews;

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
    private MaterialCardView sportsCard;
    private MaterialCardView healthCard;

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

        sportsCard = findViewById(R.id.sports_card);
        healthCard = findViewById(R.id.health_card);

        sportsCard.setOnClickListener(view -> {
            sportsCard.setChecked(!sportsCard.isChecked());
        });

        healthCard.setOnClickListener(view -> {
            healthCard.setChecked(!healthCard.isChecked());
        });
    }
}