package com.javabasic.lesson7;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        int number1 = enterNumber();
        int number2 = enterNumber();
        findGreatestCommonDivisor(number1, number2);
    }



    public static int enterNumber(){
        System.out.println("Enter number : ");
        Scanner scanner = new Scanner(System.in);
        int Number = scanner.nextInt();
        return Number;
    }



    public static void findGreatestCommonDivisor(int number1,int number2){
        while (number1 != number2) {
            if(number1 > number2)
                number1 = number1 - number2;
            else
                number2 = number2 - number1;
        }
        System.out.printf("The greatest common divisor is : %d", number2);
    }
}

