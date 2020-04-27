package com.example.pizzashop;

import java.io.Serializable;

public class Order implements Serializable {

    int[] drinks;

    public Order()
    {
        drinks = new int[]{0, 0, 0};
    }

    public void setDrinks(int small, int medium, int large)
    {
        drinks[0] = small;
        drinks[1] = medium;
        drinks[2] = large;
    }

    public int[] getDrinks()
    {
        return drinks;
    }



}
