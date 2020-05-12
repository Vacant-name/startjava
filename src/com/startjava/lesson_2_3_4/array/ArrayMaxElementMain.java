package com.startjava.lesson_2_3_4.array;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ArrayMaxElementMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Set the lenght of the array: ");
        int maxLenght = sc.nextInt();
        int[] numbers = new int[maxLenght];

        System.out.println("Fill the array with integers separated by a space: ");
        for(int i = 0; i < maxLenght; i++) {
            numbers[i] = sc.nextInt();
        }

        int max = numbers[0];
        for(int i = 0; i < maxLenght - 1; i++) {
            if(max < numbers[i + 1]) {
                max = numbers[i + 1];
            }
            System.out.println("MAX number = " + max);
        }
    }
}
