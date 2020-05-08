package com.startjava.lesson_2_3_4.array;

public class arrayMain {

    public static void main(String[] args) {

        int[] numbers = new int[6];

        float[] numbers1 = {3.4f, .5f, 200.3f};

//        System.out.println(numbers.length);
//        System.out.println(numbers1.length);

//        System.out.println(numbers);

        for(int i = 0; i < numbers1.length; i++) {
            System.out.print(numbers1[i] + " ");
        }
    }
}
