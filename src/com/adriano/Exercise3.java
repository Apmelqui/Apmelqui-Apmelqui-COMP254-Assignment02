package com.adriano;

import jdk.swing.interop.SwingInterOpUtils;

public class Exercise3 {
    public static int find_missing_number(int[] numbers) {
        int n = numbers.length + 1;

        int sum = (n * (n + 1)) / 2;
        for (int i = 0; i < numbers.length; i++) {
            sum -= numbers[i];
        }
        return sum;
    }


    public static void main(String[] args) {
        int[] a2 = {1, 3, 4};
        int missing_number2 = find_missing_number(a2);
        System.out.println("The missing number is: " + missing_number2);


        int[] a7 = { 1, 2, 3, 4, 5, 6, 8, 9 };
        int missing_number7 = find_missing_number(a7);
        System.out.println("The missing number is: " + missing_number7);
    }
}
