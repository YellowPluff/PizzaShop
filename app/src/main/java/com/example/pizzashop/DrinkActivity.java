package com.example.pizzashop;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DrinkActivity extends AppCompatActivity {

    private EditText drinkInputSmall;
    private EditText drinkInputMedium;
    private EditText drinkInputLarge;
    private TextView summaryTextView;

    private int numSmall;
    private int numMedium;
    private int numLarge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);
        getSupportActionBar().setTitle("Drinks");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        numSmall = Order.drinks[0];
        numMedium = Order.drinks[1];
        numLarge = Order.drinks[2];
        summaryTextView = findViewById(R.id.drink_summary_textview);
        summaryTextView.setText("Summary:\n\n"+numSmall+" Small\n"+numMedium+" Medium\n"+numLarge+" Large");

        smallDrinkInput();
        mediumDrinkInput();
        largeDrinkInput();

    }

    private void smallDrinkInput() {
        drinkInputSmall = findViewById(R.id.drink_input_small);
        drinkInputSmall.setText(numSmall+"");
        drinkInputSmall.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    numSmall = Integer.parseInt(s.toString());
                    String summaryText = "Summary:\n\n"+numSmall+" Small\n"+numMedium+" Medium\n"+numLarge+" Large";
                    summaryTextView.setText(summaryText);
                } catch (NumberFormatException e) {

                }
            }
        });
    }

    private void mediumDrinkInput() {
        drinkInputMedium = findViewById(R.id.drink_input_medium);
        drinkInputMedium.setText(numMedium+"");
        drinkInputMedium.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    numMedium = Integer.parseInt(s.toString());
                    String summaryText = "Summary:\n\n"+numSmall+" Small\n"+numMedium+" Medium\n"+numLarge+" Large";
                    summaryTextView.setText(summaryText);
                } catch (NumberFormatException e) {

                }
            }
        });
    }

    private void largeDrinkInput() {
        drinkInputLarge = findViewById(R.id.drink_input_large);
        drinkInputLarge.setText(numLarge+"");
        drinkInputLarge.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    numLarge = Integer.parseInt(s.toString());
                    String summaryText = "Summary:\n\n"+numSmall+" Small\n"+numMedium+" Medium\n"+numLarge+" Large";
                    summaryTextView.setText(summaryText);
                } catch (NumberFormatException e) {

                }
            }
        });
    }

    //Back arrow top left
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(this, "Drinks Updated", Toast.LENGTH_SHORT).show();
        Order.drinks[0] = numSmall;
        Order.drinks[1] = numMedium;
        Order.drinks[2] = numLarge;
        finish();
        return super.onOptionsItemSelected(item);
    }

    //Back button
    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Drinks Updated", Toast.LENGTH_SHORT).show();
        Order.drinks[0] = numSmall;
        Order.drinks[1] = numMedium;
        Order.drinks[2] = numLarge;
        finish();
    }
}
