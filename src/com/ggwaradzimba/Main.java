package com.ggwaradzimba;


import java.util.Scanner;

public class Main {

    // declare scanner
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int numOfIntegers = readInteger();
        int[] integerArray = readElements(numOfIntegers);
        int min = findMin(integerArray);
        System.out.println("The minimum value is: " + min);
    }

    private static int readInteger() {
        System.out.println("Enter the number of integers to enter: ");
        int numOfIntegers = scanner.nextInt();

        return numOfIntegers;
    }

    private static int[] readElements(int numOfIntegers) {
        System.out.println("Enter " + numOfIntegers + " integers: ");
        int [] integerArray = new int[numOfIntegers];
        //int enteredInteger;
        for(int i = 0; i < numOfIntegers; i++) {
            integerArray[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return integerArray;
    }

    private static int findMin(int [] array) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
