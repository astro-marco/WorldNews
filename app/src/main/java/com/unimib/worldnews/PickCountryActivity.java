package com.unimib.worldnews;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;

public class PickCountryActivity extends AppCompatActivity {

    public static final String TAG = PickCountryActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_a_country);

        try {
            Log.d(TAG, savedInstanceState.getString("EMAIL_KEY"));
        } catch (Exception e) {

        }
    }
}