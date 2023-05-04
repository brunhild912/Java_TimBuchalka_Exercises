package com.arrayLists;

import java.util.Scanner;

public class arrayOperations {
    private static Scanner takeInput = new Scanner(System.in);
    //get Integers
    //store them in an array
    //sort Array
    //print array

    public static int[] getIntegers(int capacity){
        int[] array = new int[capacity];
        for (int i = 0; i < array.length; i++){
            System.out.println("Enter number for position: " + i + ": ");
            array[i] = takeInput.nextInt();
        }
        return array;
    }

    public static int[] sortArray (int[] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 1; j <= i; j++){
                if (array[i] < array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
