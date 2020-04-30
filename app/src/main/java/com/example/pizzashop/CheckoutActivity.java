package com.example.pizzashop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CheckoutActivity extends AppCompatActivity {

    private TextView cheesePizzaSlice, cheesePizzaHalfPie, cheesePizzaPie;
    private TextView meatLoversPizzaSlice, meatLoversPizzaHalfPie, meatLoversPizzaPie;
    private TextView soupCheeseburger, soupCheesyHam;
    private TextView drinkSmall, drinkMedium, drinkLarge;
    private Button checkoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
        getSupportActionBar().setTitle("Checkout");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        initFields();
        setValues();
    }

    private void initFields() {
        cheesePizzaSlice = findViewById(R.id.cheese_pizza_slice_textview);
        cheesePizzaHalfPie = findViewById(R.id.cheese_pizza_halfpie_textview);
        cheesePizzaPie = findViewById(R.id.cheese_pizza_pie_textview);
        meatLoversPizzaSlice = findViewById(R.id.meatlovers_pizza_slice_textview);
        meatLoversPizzaHalfPie = findViewById(R.id.meatlovers_pizza_halfpie_textview);
        meatLoversPizzaPie = findViewById(R.id.meatlovers_pizza_pie_textview);
        soupCheeseburger = findViewById(R.id.soups_cheeseburger_textview);
        soupCheesyHam = findViewById(R.id.soups_cheesyham_textview);
        drinkSmall = findViewById(R.id.drinks_small_textview);
        drinkMedium = findViewById(R.id.drinks_medium_textview);
        drinkLarge = findViewById(R.id.drinks_large_textview);
        checkoutButton = findViewById(R.id.checkout_button);
    }

    private void setValues() {
        cheesePizzaSlice.setText(Order.cheesePizza[0]+"");
        cheesePizzaHalfPie.setText(Order.cheesePizza[1]+"");
        cheesePizzaPie.setText(Order.cheesePizza[2]+"");
        meatLoversPizzaSlice.setText(Order.meatLoversPizza[0]+"");
        meatLoversPizzaHalfPie.setText(Order.meatLoversPizza[1]+"");
        meatLoversPizzaPie.setText(Order.meatLoversPizza[2]+"");
        soupCheeseburger.setText(Order.soups[0]+"");
        soupCheesyHam.setText(Order.soups[1]+"");
        drinkSmall.setText(Order.drinks[0]+"");
        drinkMedium.setText(Order.drinks[0]+"");
        drinkLarge.setText(Order.drinks[0]+"");
        checkoutButton.setText("Place Order $" + Order.calculateTotal());
    }

    public void editCheesePizza(View view) {
        Intent intent = new Intent(this, CheesePizzaActivity.class);
        startActivityForResult(intent, 1);
    }

    public void editMeatLoversPizza(View view) {
        Intent intent = new Intent(this, MeatLoversPizzaActivity.class);
        startActivityForResult(intent, 1);
    }

    public void editSoups(View view) {
        Intent intent = new Intent(this, SoupActivity.class);
        startActivityForResult(intent, 1);
    }

    public void editDrinks(View view) {
        Intent intent = new Intent(this, DrinkActivity.class);
        startActivityForResult(intent, 1);
    }

    public void placeOrder(View view) {
        Toast.makeText(this, "Order Placed", Toast.LENGTH_SHORT).show();
        Order.resetOrder();
        finish();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            setValues();
        }
    }

    //Back arrow top left
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        finish();
        return super.onOptionsItemSelected(item);
    }

    //Back button
    @Override
    public void onBackPressed() {
        finish();
    }

}
