package com.javabasic.lesson4;

import java.util.Scanner;

public class ConditionPratice {
    public static void main(String[] args) {
        int age = enterAge();
        checkAge(age);
    }


    public static int enterAge(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter age : ");
        int age = scanner.nextInt();
        return age;
    }



    public static void checkAge(int age){
        if (age<0){
            System.out.println("Invalid age !");
        }
        else {
            if (age<18){
                System.out.println("This is children");
            }
            else {
                if (age>=18 && age<=200){
                    System.out.println("This is adult");
                }
                else{
                    System.out.println("this is a monster");
                };
            };
        };
    }
}


