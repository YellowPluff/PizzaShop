package com.example.pizzashop;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setSubtitle("The Best Pizza");
    }

    public void openPizzaActivity(View view) {
        Intent intent = new Intent(this, PizzaActivity.class);
        startActivity(intent);
    }

    public void openSoupsActivity(View view) {
        Intent intent = new Intent(this, SoupActivity.class);
        startActivity(intent);
    }

    public void openDrinksActivity(View view) {
        Intent intent = new Intent(this, DrinkActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.shopping_cart, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.action_shopping_cart) {
            Intent intent = new Intent(this, CheckoutActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
