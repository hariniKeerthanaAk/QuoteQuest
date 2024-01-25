package com.harini.quotequest;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageButton favButtonBorder;
    private ImageButton favButtonFull;
    private TextView quoteTextView;
    private TextView authorTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        favButtonBorder = findViewById(R.id.favButtonBorder);
        favButtonFull = findViewById(R.id.favButtonFull);
        quoteTextView = findViewById(R.id.quoteView);
        authorTextView = findViewById(R.id.quoteAuthorView);

        Quote quoteOfTheDay = getRandomQuoteByDate(LocalDate.now());

        quoteTextView.setText(quoteOfTheDay.quote);
        authorTextView.setText(quoteOfTheDay.author);

        favButtonBorder.setOnClickListener(v -> {
            favButtonBorder.setVisibility(View.GONE);
            favButtonFull.setVisibility(View.VISIBLE);
        });

        favButtonFull.setOnClickListener(v -> {
            favButtonFull.setVisibility(View.GONE);
            favButtonBorder.setVisibility(View.VISIBLE);
        });
    }

    private List<Quote> generate100Quotes() {
        List<Quote> quotes = new ArrayList<>();

        quotes.add(new Quote("The only way to do great work is to love what you do.", "Steve Jobs"));
        quotes.add(new Quote("In three words I can sum up everything I've learned about life: it goes on.", "Robert Frost"));
        quotes.add(new Quote("Success is not final, failure is not fatal: It is the courage to continue that counts.", "Winston Churchill"));
        quotes.add(new Quote("Life is what happens when you're busy making other plans.", "John Lennon"));
        quotes.add(new Quote("Believe you can and you're halfway there.", "Theodore Roosevelt"));
        quotes.add(new Quote("It does not matter how slowly you go as long as you do not stop.", "Confucius"));
        quotes.add(new Quote("The only limit to our realization of tomorrow will be our doubts of today.", "Franklin D. Roosevelt"));
        quotes.add(new Quote("Your time is limited, don't waste it living someone else's life.", "Steve Jobs"));
        quotes.add(new Quote("Life is really simple, but we insist on making it complicated.", "Confucius"));
        quotes.add(new Quote("The best way to predict the future is to create it.", "Peter Drucker"));
        quotes.add(new Quote("The only impossible journey is the one you never begin.", "Tony Robbins"));
        quotes.add(new Quote("Happiness is not by chance, but by choice.", "Jim Rohn"));
        quotes.add(new Quote("Success usually comes to those who are too busy to be looking for it.", "Henry David Thoreau"));
        quotes.add(new Quote("The future belongs to those who believe in the beauty of their dreams.", "Eleanor Roosevelt"));
        quotes.add(new Quote("Do not wait to strike till the iron is hot, but make it hot by striking.", "William Butler Yeats"));
        quotes.add(new Quote("Don't watch the clock; do what it does. Keep going.", "Sam Levenson"));
        quotes.add(new Quote("You are never too old to set another goal or to dream a new dream.", "C.S. Lewis"));
        quotes.add(new Quote("The only thing standing between you and your goal is the story you keep telling yourself as to why you can't achieve it.", "Jordan Belfort"));
        quotes.add(new Quote("The purpose of our lives is to be happy.", "Dalai Lama"));
        quotes.add(new Quote("The best revenge is massive success.", "Frank Sinatra"));
        quotes.add(new Quote("Success is not in what you have, but who you are.", "Bo Bennett"));
        quotes.add(new Quote("I find that the harder I work, the more luck I seem to have.", "Thomas Jefferson"));
        quotes.add(new Quote("A journey of a thousand miles begins with a single step.", "Lao Tzu"));
        quotes.add(new Quote("Success is not just about making money. It's about making a difference.", "Unknown"));
        quotes.add(new Quote("Don't be pushed around by the fears in your mind. Be led by the dreams in your heart.", "Roy T. Bennett"));
        quotes.add(new Quote("The only place where success comes before work is in the dictionary.", "Vidal Sassoon"));
        quotes.add(new Quote("If you want to achieve greatness stop asking for permission.", "Anonymous"));
        quotes.add(new Quote("Your work is going to fill a large part of your life, and the only way to be truly satisfied is to do what you believe is great work. And the only way to do great work is to love what you do.", "Steve Jobs"));
        quotes.add(new Quote("I find that when you have a real interest in life and a curious life, that sleep is not the most important thing.", "Martha Stewart"));
        quotes.add(new Quote("It's not what happens to you, but how you react to it that matters.", "Epictetus"));
        quotes.add(new Quote("It is never too late to be what you might have been.", "George Eliot"));
        quotes.add(new Quote("The only thing standing between you and your goal is the story you keep telling yourself as to why you can't achieve it.", "Jordan Belfort"));
        quotes.add(new Quote("Success is not just about making money. It's about making a difference.", "Unknown"));
        quotes.add(new Quote("Don't be pushed around by the fears in your mind. Be led by the dreams in your heart.", "Roy T. Bennett"));
        quotes.add(new Quote("The only place where success comes before work is in the dictionary.", "Vidal Sassoon"));
        quotes.add(new Quote("If you want to achieve greatness stop asking for permission.", "Anonymous"));
        quotes.add(new Quote("Your work is going to fill a large part of your life, and the only way to be truly satisfied is to do what you believe is great work. And the only way to do great work is to love what you do.", "Steve Jobs"));
        quotes.add(new Quote("I find that when you have a real interest in life and a curious life, that sleep is not the most important thing.", "Martha Stewart"));
        quotes.add(new Quote("It's not what happens to you, but how you react to it that matters.", "Epictetus"));
        quotes.add(new Quote("It is never too late to be what you might have been.", "George Eliot"));
        quotes.add(new Quote("The only thing standing between you and your goal is the story you keep telling yourself as to why you can't achieve it.", "Jordan Belfort"));
        quotes.add(new Quote("Success is not just about making money. It's about making a difference.", "Unknown"));
        quotes.add(new Quote("Don't be pushed around by the fears in your mind. Be led by the dreams in your heart.", "Roy T. Bennett"));
        quotes.add(new Quote("The only place where success comes before work is in the dictionary.", "Vidal Sassoon"));
        quotes.add(new Quote("If you want to achieve greatness stop asking for permission.", "Anonymous"));
        quotes.add(new Quote("Your work is going to fill a large part of your life, and the only way to be truly satisfied is to do what you believe is great work. And the only way to do great work is to love what you do.", "Steve Jobs"));
        quotes.add(new Quote("I find that when you have a real interest in life and a curious life, that sleep is not the most important thing.", "Martha Stewart"));
        quotes.add(new Quote("It's not what happens to you, but how you react to it that matters.", "Epictetus"));
        quotes.add(new Quote("It is never too late to be what you might have been.", "George Eliot"));
        quotes.add(new Quote("The only thing standing between you and your goal is the story you keep telling yourself as to why you can't achieve it.", "Jordan Belfort"));
        quotes.add(new Quote("Success is not just about making money. It's about making a difference.", "Unknown"));
        quotes.add(new Quote("Don't be pushed around by the fears in your mind. Be led by the dreams in your heart.", "Roy T. Bennett"));
        quotes.add(new Quote("The only place where success comes before work is in the dictionary.", "Vidal Sassoon"));
        quotes.add(new Quote("If you want to achieve greatness stop asking for permission.", "Anonymous"));
        quotes.add(new Quote("Your work is going to fill a large part of your life, and the only way to be truly satisfied is to do what you believe is great work. And the only way to do great work is to love what you do.", "Steve Jobs"));
        quotes.add(new Quote("I find that when you have a real interest in life and a curious life, that sleep is not the most important thing.", "Martha Stewart"));
        quotes.add(new Quote("It's not what happens to you, but how you react to it that matters.", "Epictetus"));
        quotes.add(new Quote("It is never too late to be what you might have been.", "George Eliot"));
        quotes.add(new Quote("The only thing standing between you and your goal is the story you keep telling yourself as to why you can't achieve it.", "Jordan Belfort"));
        quotes.add(new Quote("Success is not just about making money. It's about making a difference.", "Unknown"));
        quotes.add(new Quote("Don't be pushed around by the fears in your mind. Be led by the dreams in your heart.", "Roy T. Bennett"));
        quotes.add(new Quote("The only place where success comes before work is in the dictionary.", "Vidal Sassoon"));
        quotes.add(new Quote("If you want to achieve greatness stop asking for permission.", "Anonymous"));
        quotes.add(new Quote("Your work is going to fill a large part of your life, and the only way to be truly satisfied is to do what you believe is great work. And the only way to do great work is to love what you do.", "Steve Jobs"));
        quotes.add(new Quote("I find that when you have a real interest in life and a curious life, that sleep is not the most important thing.", "Martha Stewart"));
        quotes.add(new Quote("It's not what happens to you, but how you react to it that matters.", "Epictetus"));
        quotes.add(new Quote("It is never too late to be what you might have been.", "George Eliot"));

        return quotes;
    }

    private Quote getRandomQuoteByDate(LocalDate localDate) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        int seed = Integer.parseInt(localDate.format(formatter));

        Random random = new Random(seed);

        List<Quote> quotes = generate100Quotes();

        int randomIndex = random.nextInt(quotes.size());

        return quotes.get(randomIndex);
    }

}