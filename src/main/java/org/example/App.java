package org.example;
/**
 * @author Solomennikova N.
 * @version 1.0
 */

import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random r = new Random();
        int[] ar1 = new int[20];
        for (int i = 0; i < ar1.length; i++) {
            ar1[i] = r.nextInt(-10, 10);
            System.out.print(ar1[i] + ", ");
        }

        int maxNegative = Integer.MIN_VALUE;
        int minPositive = Integer.MAX_VALUE;

        for (int i = 0; i < ar1.length; i++) {
            if (ar1[i] < 0 && ar1[i] > maxNegative) {
                maxNegative =ar1[i];
            } else if (ar1[i] > 0 && ar1[i] < minPositive) {
                minPositive = ar1[i];
                 }
            }

        System.out.println(" ");
        System.out.println("MIN positive value of the array: " + minPositive);
        System.out.println("MAX Negative value of the array: " + maxNegative);
        System.out.println();
        System.out.println("Change MIN and MAX values:");
        for (int i = 0; i < ar1.length; i++) {
            if (ar1[i] == maxNegative) {
                ar1[i] = minPositive;
            } else if (ar1[i] == minPositive) {
                ar1[i] = maxNegative;
            }
        }
            System.out.println(Arrays.toString(ar1));
    }
}
