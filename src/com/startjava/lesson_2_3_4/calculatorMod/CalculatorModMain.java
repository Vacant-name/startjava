package com.startjava.lesson_2_3_4.calculatorMod;

import com.startjava.lesson_2_3_4.calculatorMod.CalculatorMod;

import java.util.Scanner;

public class CalculatorModMain {
    public static void main(String[] args) {
        CalculatorMod calc = new CalculatorMod();
        String letter = "";
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Input a first number ");
            calc.numArray[0] = scan.nextInt();
            scan.nextLine();

            System.out.println("Input a math symbol ");
            calc.sign = scan.nextLine();

            System.out.println("Input a second number ");
            calc.numArray[1] = scan.nextInt();

            scan.nextLine();

            calc.calculate();
            do {
                System.out.println("Want to continue ? [Y/N]");
                letter = scan.nextLine();
            } while(!letter.equals("Y") && !letter.equals("N"));
        } while(letter.equals("Y"));
        System.out.println("See you");
    }
}
