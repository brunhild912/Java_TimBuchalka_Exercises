package com.arrayLists;

public class reverseArrayChallenge {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = i;
        }

        //reversed array
        int temp;
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for (int i = 0; i < halfLength; i++){
            temp = array[i];
            array[i] = array [maxIndex - i];
            array [maxIndex - i] = temp;
        }

        //printArray
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
