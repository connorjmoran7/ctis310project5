package edu.guilford;

import java.util.Arrays;

public class InstrumentComparison {
    public static void main(String[] args) {

        // Create an array to store 3 guitars and populate it with 3 random guitars.
        // After the array is populated, print out the attributes of each guitar.

        System.out.println("Guitars:");

        Guitar[] guitars = new Guitar[3];
        for (int i = 0; i < guitars.length; i++) {
            guitars[i] = new Guitar();
            System.out.println(guitars[i]);
        }

        // Repeat the process for Drums and Saxophones.

        System.out.println("\nDrums:");

        Drums[] drums = new Drums[3];
        for (int i = 0; i < drums.length; i++) {
            drums[i] = new Drums();
            System.out.println(drums[i]);
        }

        System.out.println("\nSaxophones:");

        Saxophone[] saxophones = new Saxophone[3];
        for (int i = 0; i < saxophones.length; i++) {
            saxophones[i] = new Saxophone();
            System.out.println(saxophones[i]);
        }

        // Demonstration of the abstract method play().

        System.out.println("\nPlaying the instruments:");

        guitars[0].play();
        drums[0].play();
        saxophones[0].play();

        // Demonstration of the getAveragePrice method by Saxophone.

        System.out.println("\nAverage price of a saxophone: $" + saxophones[0].getAveragePrice());

        // Demonstration of the compareTo method for guitars.

        System.out.println("\nComparing guitars:");

        System.out.println("\n\nPre-sorting:");

        System.out.println("Guitar 1: " + guitars[0].getBrand());
        System.out.println("Guitar 2: " + guitars[1].getBrand());
        System.out.println("Guitar 3: " + guitars[2].getBrand());

        Arrays.sort(guitars);

        System.out.println("\nAfter sorting:");
        System.out.println("Guitar 1: " + guitars[0].getBrand());
        System.out.println("Guitar 2: " + guitars[1].getBrand());
        System.out.println("Guitar 3: " + guitars[2].getBrand());

    }
}
