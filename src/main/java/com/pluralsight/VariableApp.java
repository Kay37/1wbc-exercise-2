package com.pluralsight;

public class VariableApp {

    public static void main(String[] args) {

// Question 1:
//
// declare variables here
//
// then code solution
//
// then use System.out.println
//        () to display results
//
// ex: System.out.println("The answer is " + answer);
//
// REPEAT FOR NEXT EXERCISE

        /// * Declared variables *
        String myFavoriteColor = ("Green");
        /// startYear is the year I started Java Focus in Year Up United's program
        int startYear = 2026;
        /// My middle name is Kimball, so my middle initial is K
        char myMiddleInitial = 'K';
        /// I have several pets - A canine, a reptile, and an arachnid
        boolean doIHavePets = true;
        /// This is one of my favorite quotes.
        String einsteinQuote = ("I have no special talents. I am only passionately curious");

        /// * Printing of the declared variables *
        System.out.println("\u001B[1mHere are my declared variables:\u001B[0m ");
        System.out.printf("My favorite color is %s.%n", myFavoriteColor);
        System.out.printf("I started the Java Focus in %d.%n", startYear);
        System.out.printf("My middle initial is %c.%n", myMiddleInitial);
        System.out.printf("It is %b that I have pets.%n", doIHavePets);
        System.out.printf("Albert Einstein once said, \"%s\"%n%n", einsteinQuote);

        /// * Declared and initialized variables *
        System.out.println("\u001B[1mHere are my declared and initialized variables:\u001B[0m");
        /// This is the number of days in a week
        int daysInAWeek = 7;
        /// This is the price of a coffee, at some location in the world.
        double priceOfCoffee = 4.99;
        /// g is my favorite letter, because when I am writing it on paper I like to make the swoop big.
        char myFavoriteLetter = 'g';
        /// It is not currently raining where I live
        boolean isItRaining = false;

        /// * Printing of the declared and initialized variables *
        System.out.printf("There are %d days in a week.%n", daysInAWeek);
        System.out.printf("The price opf a coffee, somewhere, is $%.2f.%n", priceOfCoffee);
        System.out.printf("My favorite letter is %c because of the big swoop when drawing it.%n", myFavoriteLetter);
        System.out.printf("Is it currently raining in Rockwall? %b.%n", isItRaining);

    }

}