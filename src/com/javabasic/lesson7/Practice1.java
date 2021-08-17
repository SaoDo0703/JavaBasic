package com.javabasic.lesson7;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        int N = enterNumber();
        checkPrimeNumber(N);
        printf(N);
    }



    public static int enterNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number = ");
        int number = scanner.nextInt();
        return number;
    }



    public static boolean checkPrimeNumber(int N) {
        if (N < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(N);
        for (int i = 2; i <= squareRoot; i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void printf(int N) {
        System.out.printf("All primes less than N are: ", N);
        if (N >= 2) {
            System.out.print(2);
        }
        for (int i = 3; i < N; i += 2) {
            if (checkPrimeNumber(i)) {
                System.out.print(" " + i);
            }
        }
    }
}
