package com.example.pizzashop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MeatLoversPizzaActivity extends AppCompatActivity {

    private EditText meatPizzaInputSlice;
    private EditText meatPizzaInputHalfPie;
    private EditText meatPizzaInputPie;
    private TextView summaryTextView;

    private int numSlice;
    private int numHalfPie;
    private int numPie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meat_lovers_pizza);
        getSupportActionBar().setTitle("Meat Lovers Pizza");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        summaryTextView = findViewById(R.id.meat_pizza_summary_textview);
        numSlice = 0;
        numHalfPie = 0;
        numPie = 0;

        meatPizzaSliceInput();
        meatPizzaHalfPieInput();
        meatPizzaPieInput();
    }

    private void meatPizzaSliceInput() {
        meatPizzaInputSlice = findViewById(R.id.meat_pizza_input_slice);
        meatPizzaInputSlice.setText(numSlice+"");
        meatPizzaInputSlice.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    numSlice = Integer.parseInt(s.toString());
                    String summaryText = "Summary:\n\n"+numSlice+" Slices\n"+numHalfPie+" Half Pies\n"+numPie+" Pies";
                    summaryTextView.setText(summaryText);
                } catch (NumberFormatException e) {

                }
            }
        });
    }

    private void meatPizzaHalfPieInput() {
        meatPizzaInputHalfPie = findViewById(R.id.meat_pizza_input_half_pie);
        meatPizzaInputHalfPie.setText(numHalfPie+"");
        meatPizzaInputHalfPie.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    numHalfPie = Integer.parseInt(s.toString());
                    String summaryText = "Summary:\n\n"+numSlice+" Slices\n"+numHalfPie+" Half Pies\n"+numPie+" Pies";
                    summaryTextView.setText(summaryText);
                } catch (NumberFormatException e) {

                }
            }
        });
    }

    private void meatPizzaPieInput() {
        meatPizzaInputPie = findViewById(R.id.meat_pizza_input_pie);
        meatPizzaInputPie.setText(numPie+"");
        meatPizzaInputPie.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    numPie = Integer.parseInt(s.toString());
                    String summaryText = "Summary:\n\n"+numSlice+" Slices\n"+numHalfPie+" Half Pies\n"+numPie+" Pies";
                    summaryTextView.setText(summaryText);
                } catch (NumberFormatException e) {

                }
            }
        });
    }

    //Back arrow top left
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //TODO Add Soups
        finish();
        return super.onOptionsItemSelected(item);
    }

    //Back button
    @Override
    public void onBackPressed() {
        //TODO Add Soups
        finish();
    }
}
