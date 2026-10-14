package com.pluralsight;

public class Receipt {
    public static void main(String[] args) {

        ///variables
        String watch = ("Apple Watch Series 11");
        double watchPrice = 384.99;
        int watchQuantity = 1;
        System.out.printf("You purchased %d %s for %.2f%n", watchQuantity, watch, watchPrice);
    }
}
