package com.javabasic.lesson4;

import java.util.Scanner;

public class LoopPratice {
    public static void main(String[] args) {
        int Number1 = enterNumber();
        sumOfNumbers(Number1);
        int Number2 = enterNumber();
        multiplicationTable(Number2);
        int N = enterNumber();
        checkPrimes(N);
    }



    public static int enterNumber() {
        System.out.println("Enter number : ");
        Scanner scanner = new Scanner(System.in);
        int Number = scanner.nextInt();
        return Number;
    }



    public static void sumOfNumbers(int Number1) {
        long sum = 0;
        int i;
        for (i = 1; i <= Number1; i++) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }



    public static void multiplicationTable(int Number2) {
        int num = Number2;
        for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
    }



    public static boolean checkPrimes (int N){
        int temp;
        boolean isPrime=true;
        for(int i=2;i<=N/2;i++)
        {
            temp=N%i;
            if(temp==0)
            {
                isPrime=false;
                break;
            }
        }
        if(isPrime)
            System.out.println(" this is prime number ");
        else
            System.out.println("this is not prime number ");

        return isPrime;
    }
}



