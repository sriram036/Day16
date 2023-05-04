package com.bridgelabz;

public class BubbleSort {
    public static void main(String[] args) {
        String[] arr = {"Hello", "Welcome", "Hi", "Sriram" , "Thanks"};
        System.out.println("The given array is ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 ;j++) {
                if (arr[j].length() > arr[j+1].length()) {
                    String key = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = key;
                }
            }
        }
        System.out.println("\nThe bubble sort method array is");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
