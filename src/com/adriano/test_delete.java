package com.adriano;


public class test_delete {

    public static int
    find_missing_number(int[] numbers)
    {
        int size = numbers.length;
        int sum = ((size + 1) * (size + 2)) / 2;
        for(int i = 0; i < size; i++)
            sum -= numbers[i];
        return sum;
    }
    public static void main(String[] args)
    {
        int[] a7 = { 1, 2, 3, 4, 5, 6, 8, 9 };
        System.out.println(find_missing_number(a7));

        int[] a5 = {1, 2 ,3, 4, 6, 7, 8};
        System.out.println(find_missing_number(a5));

    }

}
