package com.startjava.lesson_2_3_4.array;

public class arrayMain {

    public static void main(String[] args) {
        int[] numbers = new int[6];
        float[] numbers1 = {3.4f, .5f, 200.3f};

//        System.out.println(numbers.length);
//        System.out.println(numbers1.length)
//        System.out.println(numbers);

        for (float number : numbers1) {
            System.out.print(number + " ");
        }

        for(int i = 0; i < numbers1.length; i++) {
            numbers[i] = i * 10;
        }

        for (float number : numbers1) {
            System.out.print(number + " ");
        }
        String[] text = new String[3];

        for(String string : text) {
            System.out.println(string);
        }
    }
}
