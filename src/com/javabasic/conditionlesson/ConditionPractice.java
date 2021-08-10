package com.javabasic.conditionlesson;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class ConditionPractice {
    public static void main(String[] args) {
        int numberOne = enterNumberOne();
        int numberTwo= enterNumberTwo();

        checkParity(numberOne) ;
        checkMaxValue( numberOne,numberTwo);
        checkAge(numberOne);
    }


    public static int enterNumberOne() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1 : ");
        int numberOne = scanner.nextInt();
        return numberOne;
    }



    public static int enterNumberTwo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number2 : ");
        int numberTwo = scanner.nextInt();
        return numberTwo;
    }



    public static void checkParity(int number) {
        if (number % 2 == 0) {
            System.out.println("even number");
        }
        else {
            System.out.println("odd");
        }
    }



    public static int checkMaxValue (int number,int number1) {
        if ( number > number1) {
            System.out.println("Max: " + number);
            return number;
        }
        else {
            System.out.println("Max: " + number1);
            return number1;
        }
    }



    public static void checkAge (int N){
        if (N < 0){
            System.out.println("invalid");
        }
        else {
            if (N < 18) {
                System.out.println("this is young buffalo");
            }
            else {
                if (N >= 18 && N < 200) {
                    System.out.println("this is adult");
                }
                else {
                    System.out.println("this is leprechaun");
                }
            }
        }
    }
}




