package com.javabasic.lesson6;

import java.util.Scanner;

public class ArrayPratice {
    public static void main(String[] args) {
        int[] number = enterNumber();
        showArray(number);
        sumArray(number);
        envenNumber(number);
    }



    public static int[] enterNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements of the array : ");

        int n = scanner.nextInt();
        int[] array = new int[10];

        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            array[i] = scanner.nextInt();
        }
        return array;
    }


    public static void showArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }


    public static void sumArray(int[] array) {
        int sum = array[0] + array[array.length - 1];
        System.out.println("Sum : " + sum);
    }


    public static void envenNumber(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print( array[i] + " ");
            }
        }
    }
}




