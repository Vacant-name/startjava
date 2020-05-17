package com.startjava.lesson_2_3_4.array;

import java.sql.SQLOutput;
import java.util.Scanner;

public class WebTasks {
    public static void main(String[] args) {
//        int[] array = new int[10];
//        for(int i = 0; i < array.length; i++) {
//            int number = i * 2;
//            System.out.print(number + " ");
//        }


//        System.out.println();
//        int[] array1 = {1, 2, 3, 5};
//        for(int i = 0; i < array1.length; i++) {
//            System.out.print(array1[i] + " ");
//        }


//        int[] array = {-5, 3, 4, -2, 0, 2, 6, 8, 1, -77};
//        int sum = 0;
//        for(int i = 0; i < array.length; i++) {
//            int number = i;
//            if(number % 2 == 0) {
//                if(number > 0) {
//                    sum += number;
//                }
//            }
//        }
//        System.out.println(sum);

        int[] array = {1, 8, 3, -3, 4, 5, 6};
        int max = array[0];
        for(int i = 0; i < array.length - 2; i = i + 2) {
            if(array[i + 2] > max)
                max = array[i + 2];
        }
        System.out.print(max);
    }
}
