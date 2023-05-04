package com.bridgelabz;

public class InsertionSort {
    public static void main(String[] args) {
        String[] arr = {"Hello", "Welcome", "Hi", "Sriram" , "Thanks"};

        System.out.println("The given array is :");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 1; i < arr.length; i++) {
            String key = arr[i];
            int j = i - 1;
            while (j >= 0 && key.length() < arr[j].length()){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        System.out.println("\nThe insertion sort method array is");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
