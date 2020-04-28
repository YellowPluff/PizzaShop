package com.example.pizzashop;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SoupActivity extends AppCompatActivity {

    private EditText cheeseburgerInput;
    private EditText cheesyHamInput;
    private TextView summaryTextView;

    private int numCheeseburger;
    private int numCheesyHam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soup);
        getSupportActionBar().setTitle("Soups");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        numCheeseburger = Order.soups[0];
        numCheesyHam = Order.soups[1];
        summaryTextView = findViewById(R.id.soup_summary_textview);
        summaryTextView.setText("Summary:\n\n"+numCheeseburger+" Cheeseburger Soup\n"+numCheesyHam+" Cheesy Ham Chowder");

        inputCheeseburger();
        inputCheesyHam();
    }

    private void inputCheeseburger() {
        cheeseburgerInput = findViewById(R.id.soup_input_cheeseburger);
        cheeseburgerInput.setText(numCheeseburger+"");
        cheeseburgerInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    numCheeseburger = Integer.parseInt(s.toString());
                    String summaryText = "Summary:\n\n"+numCheeseburger+" Cheeseburger Soup\n"+numCheesyHam+" Cheesy Ham Chowder";
                    summaryTextView.setText(summaryText);
                } catch (NumberFormatException e) {

                }
            }
        });
    }

    private void inputCheesyHam() {
        cheesyHamInput = findViewById(R.id.soup_input_cheesy_ham);
        cheesyHamInput.setText(numCheesyHam+"");
        cheesyHamInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    numCheesyHam = Integer.parseInt(s.toString());
                    String summaryText = "Summary:\n\n"+numCheeseburger+" Cheeseburger Soup\n"+numCheesyHam+" Cheesy Ham Chowder";
                    summaryTextView.setText(summaryText);
                } catch (NumberFormatException e) {

                }
            }
        });
    }

    //Back arrow top left
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(this, "Soups Updated", Toast.LENGTH_SHORT).show();
        Order.soups[0] = numCheeseburger;
        Order.soups[1] = numCheesyHam;
        finish();
        return super.onOptionsItemSelected(item);
    }

    //Back button
    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Soups Updated", Toast.LENGTH_SHORT).show();
        Order.soups[0] = numCheeseburger;
        Order.soups[1] = numCheesyHam;
        finish();
    }
}
