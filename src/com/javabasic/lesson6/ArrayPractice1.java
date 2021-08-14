package com.javabasic.lesson6;

import java.util.Scanner;

public class ArrayPractice1 {
     public static void main(String[] args) {
          int[] number = enterArray();
          increaseArray(number);
          largestElementInArray(number);
          smallestElementInArray(number);
          int x = 10;
          findElementPositionInArray(number, x);
     }


     public static int[] enterArray() {
          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter the number of elements of the array : ");

          int n = scanner.nextInt();
          int[] array = new int[n];

          System.out.println("Enter the elements of the array : ");
          for (int i = 0; i < n; i++) {
               System.out.printf("a[%d] = ", i);
               array[i] = scanner.nextInt();
          }
          return array;
     }


     public static void increaseArray(int[] array) {
          for (int i = 0; i < array.length; i++) {
               array[i] += 1;
               System.out.println(array[i] + " ");
          }
     }


     public static int largestElementInArray(int[] array) {
          int maxValue = array[0];
          for (int i = 1; i < array.length; i++) {
               if (array[i] > maxValue) {
                    maxValue = array[i];
               }
          }
          System.out.println("Max: " + maxValue);
          return maxValue;
     }


     public static int smallestElementInArray(int[] array) {
          int minValue = array[0];
          for (int i = 1; i < array.length; i++) {
               if (array[i] < minValue) {
                    minValue = array[i];
               }
          }
          System.out.println("Min: " + minValue);
          return minValue;
     }


     public static int findElementPositionInArray(int[] array, int x) {
          for (int i = 0; i < array.length; i++) {
               if (array[i] == x) {
                    System.out.println("Position: " + i);
                    return i;
               }
          }
          System.out.print("Not found");
          return -1;
     }
}











