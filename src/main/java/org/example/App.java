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
        for(int i = 0; i < ar1.length; i++) {
            ar1[i] = r.nextInt(-10,10);
            System.out.print(ar1[i] + ", ");
        }
        int minValue = 10;
        int minPosition = 0;
        int maxValue = -10;
        int maxPosition = 0;
        for (int i = 0; i < ar1.length; i++) {
            if (ar1[i] < minValue) {
                minValue = ar1[i];
                minPosition = i;
            }
            if (ar1[i] > maxValue) {
                maxValue = ar1[i];
                maxPosition = i;
            }
        }
        System.out.println(" ");
        System.out.println("MIN value of the array: " + minValue);
        System.out.println("MAX value of the array: " + maxValue);
        System.out.println();
        System.out.println("Change MIN and MAX values:");
        ar1[minPosition] = maxValue;
        ar1[maxPosition] = minValue;

        System.out.println(Arrays.toString(ar1));
    }
}