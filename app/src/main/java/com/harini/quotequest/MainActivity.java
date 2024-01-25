package com.harini.quotequest;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ImageButton favButtonBorder;
    private ImageButton favButtonFull;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        favButtonBorder = findViewById(R.id.favButtonBorder);
        favButtonFull = findViewById(R.id.favButtonFull);

        favButtonBorder.setOnClickListener(v -> {
            favButtonBorder.setVisibility(View.GONE);
            favButtonFull.setVisibility(View.VISIBLE);
        });

        favButtonFull.setOnClickListener(v -> {
            favButtonFull.setVisibility(View.GONE);
            favButtonBorder.setVisibility(View.VISIBLE);
        });
    }
}