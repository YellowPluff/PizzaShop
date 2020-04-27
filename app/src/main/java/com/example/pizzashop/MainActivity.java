package com.example.pizzashop;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Order customerOrder;
    private int DRINKS_REQ_CODE = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setSubtitle("The Best Pizza");

        customerOrder = new Order();
    }

    public void openPizzaActivity(View view) {
        Toast.makeText(this, "Open Pizza Activity", Toast.LENGTH_SHORT).show();
    }

    public void openSoupsActivity(View view) {
        Toast.makeText(this, "Open Soup Activity", Toast.LENGTH_SHORT).show();
    }

    public void openDrinksActivity(View view) {
        Intent intent = new Intent(this, DrinkActivity.class);
        intent.putExtra("ORDER", customerOrder);
        startActivityForResult(intent, DRINKS_REQ_CODE);
//        startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == DRINKS_REQ_CODE) {
            if(resultCode == Activity.RESULT_OK){
                customerOrder = (Order) data.getSerializableExtra("ORDER");
//                int smallDrinks = data.getIntExtra("SMALL_DRINK", 0);
//                int mediumDrinks = data.getIntExtra("MEDIUM_DRINK", 0);
//                int largeDrinks = data.getIntExtra("LARGE_DRINK", 0);
//                customerOrder.setDrinks(smallDrinks, mediumDrinks, largeDrinks);
            }
            if (resultCode == Activity.RESULT_CANCELED) {
                //Write your code if there's no result
            }
        }
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
            int[] drinksInOrder = customerOrder.getDrinks();
            Log.w("fatal", "Small: " + drinksInOrder[0] + ". Medium: " + drinksInOrder[1] + ". Large: " + drinksInOrder[2] + ".");
//            Intent intent = new Intent(this, HelpActivity.class);
//            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
