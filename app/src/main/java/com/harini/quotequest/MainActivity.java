package com.harini.quotequest;

import static com.harini.quotequest.QuoteManager.getRandomQuoteByDate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.time.LocalDate;

public class MainActivity extends AppCompatActivity {
    private ImageButton favButtonBorder;
    private ImageButton favButtonFull;
    private TextView quoteTextView;
    private TextView authorTextView;
    private TextView favourites;
    private QuoteManager quoteManager = new QuoteManager();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        favButtonBorder = findViewById(R.id.favButtonBorder);
        favButtonFull = findViewById(R.id.favButtonFull);
        quoteTextView = findViewById(R.id.quoteView);
        authorTextView = findViewById(R.id.quoteAuthorView);
        favourites = findViewById(R.id.favListButton);

        Quote quoteOfTheDay = getRandomQuoteByDate(LocalDate.now());

        setIconVisibility(quoteOfTheDay);

        quoteTextView.setText(quoteOfTheDay.quote);
        authorTextView.setText(quoteOfTheDay.author);

        favourites.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, FavoriteListActivity.class);
            startActivity(intent);
        });

        favButtonBorder.setOnClickListener(v -> {
            quoteManager.addFavoriteQuote(this, quoteOfTheDay);
            quoteManager.logFavouriteQuotes(this);
            setIconVisibility(quoteOfTheDay);
        });

        favButtonFull.setOnClickListener(v -> {
            quoteManager.removeFavoriteQuote(this, quoteOfTheDay);
            quoteManager.logFavouriteQuotes(this);
            setIconVisibility(quoteOfTheDay);
        });
    }

    private void setIconVisibility(Quote quote) {
        if (quoteManager.isQuoteFavourite(this, quote)) {
            favButtonBorder.setVisibility(View.GONE);
            favButtonFull.setVisibility(View.VISIBLE);
            return;
        }
        favButtonFull.setVisibility(View.GONE);
        favButtonBorder.setVisibility(View.VISIBLE);
    }

}