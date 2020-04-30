package com.example.pizzashop;

import java.io.Serializable;

public class Order implements Serializable {

    public static int[] cheesePizza = new int[]{0, 0, 0};
    public static double[] cheesePizzaPrices = new double[]{0.99, 3.50, 6.99};

    public static int[] meatLoversPizza = new int[]{0, 0, 0};
    public static double[] meatLoversPizzaPrices = new double[]{1.49, 3.99, 7.99};

    public static int[] soups = new int[]{0, 0};
    public static double[] soupsPrices = new double[]{3.99, 3.99};

    public static int[] drinks = new int[]{0, 0, 0};
    public static double[] drinksPrices = new double[]{0.99, 1.99, 2.99};

    public static void resetOrder() {
        for(int i = 0; i < cheesePizza.length; i++) {
            cheesePizza[i] = 0;
        }
        for(int i = 0; i < meatLoversPizza.length; i++) {
            meatLoversPizza[i] = 0;
        }
        for(int i = 0; i < soups.length; i++) {
            soups[i] = 0;
        }
        for(int i = 0; i < drinks.length; i++) {
            drinks[i] = 0;
        }
    }

    public static String calculateTotal() {
        double total = 0;
        for(int i = 0; i < cheesePizza.length; i++) {
            total += cheesePizza[i] * cheesePizzaPrices[i];
        }
        for(int i = 0; i < meatLoversPizza.length; i++) {
            total += meatLoversPizza[i] * meatLoversPizzaPrices[i];
        }
        for(int i = 0; i < soups.length; i++) {
            total += soups[i] * soupsPrices[i];
        }
        for(int i = 0; i < drinks.length; i++) {
            total += drinks[i] * drinksPrices[i];
        }
        return String.format("%.2f", total);
    }

}
