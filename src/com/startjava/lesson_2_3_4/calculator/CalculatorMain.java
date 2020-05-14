package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        char answer;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Enter the math expression ");
            calc.setStrExp(scan.nextLine());

            calc.calculate();
            do {
                System.out.println("Want to continue ? [Y/N]");
                answer = scan.next().charAt(0);
            } while(answer != 'Y' && answer != 'N');
        } while(answer == 'Y');
        System.out.println("See you");
    }
}
