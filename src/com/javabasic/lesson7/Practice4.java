package com.javabasic.lesson7;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        int number1 = enterNumber();
        checkPrimeNumber(number1);
        printf(number1);
    }


    public static int enterNumber(){
        System.out.println("Enter number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }



    public static boolean checkPrimeNumber(int number1) {
        if (number1 < 2) {

            return false;
        }
        int squareRoot = (int) Math.sqrt(number1);

        for (int i = 2; i <= squareRoot; i++) {
            if (number1 % i == 0) {

                return false;
            }
        }

        return true;
    }



    public static void printf(int number1){
        System.out.printf("%d first prime number is : \n", number1);
        int dem = 0;
        int i = 2;
        while (dem < number1) {
            if (checkPrimeNumber(i)) {
                System.out.print(i + " ");
                dem++;
            }
            i++;
        }
    }
}

