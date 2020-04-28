package com.example.pizzashop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class CheesePizzaActivity extends AppCompatActivity {

    private EditText cheesePizzaInputSlice;
    private EditText cheesePizzaInputHalfPie;
    private EditText cheesePizzaInputPie;
    private TextView summaryTextView;

    private int numSlice;
    private int numHalfPie;
    private int numPie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheese_pizza);
        getSupportActionBar().setTitle("Cheese Pizza");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        summaryTextView = findViewById(R.id.cheese_pizza_summary_textview);
        numSlice = 0;
        numHalfPie = 0;
        numPie = 0;

        cheesePizzaSliceInput();
        cheesePizzaHalfPieInput();
        cheesePizzaPieInput();
    }

    private void cheesePizzaSliceInput() {
        cheesePizzaInputSlice = findViewById(R.id.cheese_pizza_input_slice);
        cheesePizzaInputSlice.setText(numSlice+"");
        cheesePizzaInputSlice.addTextChangedListener(new TextWatcher() {
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

    private void cheesePizzaHalfPieInput() {
        cheesePizzaInputHalfPie = findViewById(R.id.cheese_pizza_input_half_pie);
        cheesePizzaInputHalfPie.setText(numHalfPie+"");
        cheesePizzaInputHalfPie.addTextChangedListener(new TextWatcher() {
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

    private void cheesePizzaPieInput() {
        cheesePizzaInputPie = findViewById(R.id.cheese_pizza_input_pie);
        cheesePizzaInputPie.setText(numPie+"");
        cheesePizzaInputPie.addTextChangedListener(new TextWatcher() {
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
