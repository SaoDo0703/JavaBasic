package com.javabasic.lesson6;

public class ArrayOption {
    public static void main(String[] args) {
        int[] array = new int[10];
        array[0]=4;
        array[1]=7;
        array[2]=8;
        array[3]=5;
        array[4]=19;
        array[5]=11;
        printArray(array);
        insertArray(array, 2,100);
        deleteArray(array,1);
    }
    public static void printArray(int[] array){
        System.out.println("given array: ");
        for (int i=0;i<array.length;i++) {
            System.out.println(array[i] + "  ");
        }
    }
    public static void insertArray(int[] array, int k, int value){
        int length = array.length-1;

        for (int i=length;i>k;i--){
            array[i]=array[i-1];
            System.out.println(array[i]);
        }
        array[k]=value;
        printArray(array);
    }


    public static void deleteArray(int[] array, int k){
        for (int i=k; i<array.length-1;i++){
            array[i]=array[i+1];
        }
        printArray(array);
    }
}



