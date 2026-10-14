package com.pluralsight;

public class Receipt {
    public static void main(String[] args) {

        /// * variables *
        ///This is the watch I purchased
        String watch = ("Apple Watch Series 11");
        ///This is the price of said watch, that I purchased
        double watchPrice = 384.99;
        ///This is how many of the watch I purchased
        int watchQuantity = 1;
        System.out.printf("You purchased %d %s for %.2f%n", watchQuantity, watch, watchPrice);
    }
}
