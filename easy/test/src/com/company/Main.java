package com.company;


import java.util.Arrays;
import java.util.logging.Logger;


public class Main {

    static int[] arr = {3,3};
    static int d = 6;

    public static void main(String[] args) {

       // System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            x = -x;
        }
        long reverse = 0;
        while (x > 0) {
            reverse = reverse * 10 + x % 10;
            System.out.println(String.valueOf(reverse));
            x /= 10;
            System.out.println(String.valueOf(x));
        }
        if (reverse > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) (isNegative ? -reverse : reverse);
    }

    private static int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
            return new int[]{0};
    }

    private void leftRotation() {
        while (d > 0) {
            int zero = arr[0];
            for (int i = 1; i < arr.length; i++) {
                arr[i - 1] = arr[i];
            }
            arr[arr.length - 1] = zero;
            d--;
        }


        System.out.println(Arrays.toString(arr));
    }

    private void rightRotation() {
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        System.out.println(Arrays.toString(arr));

    }
}
