package com.example.pizzashop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class PizzaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);
        getSupportActionBar().setTitle("Pizzas");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void openCheesePizzaMenuActivity(View view) {
        Intent intent = new Intent(this, CheesePizzaActivity.class);
        startActivity(intent);
    }

    public void openMeatLoversPizzaMenuActivity(View view) {
        Intent intent = new Intent(this, MeatLoversPizzaActivity.class);
        startActivity(intent);
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
