package com.harini.quotequest;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Set;

public class FavoriteListActivity extends AppCompatActivity {

    private final QuoteManager quoteManager = new QuoteManager();

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favorite_list_activity);

        Set<Quote> favoriteQuotes = quoteManager.getFavouriteQuotes(this);
        LinearLayout linearLayout = findViewById(R.id.linear_layout);


        for (Quote quote : favoriteQuotes) {
            LinearLayout containerLayout = new LinearLayout(this);

            LinearLayout.LayoutParams containerParams = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT);
            containerParams.setMargins(30, 15, 30, 15);
            containerLayout.setLayoutParams(containerParams);

            TextView textView = new TextView(this);

            LinearLayout.LayoutParams textParams = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT);
            textParams.setMargins(30, 15, 30, 15);
            textView.setLayoutParams(textParams);

            textView.setText(quote.quote + " (" + quote.author + ")");
            textView.setTextSize(18);

            containerLayout.addView(textView);

            containerLayout.setBackgroundResource(R.drawable.border_background);

            linearLayout.addView(containerLayout);
        }


    }

}
