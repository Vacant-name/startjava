package com.startjava.lesson_2_3_4.calculatorMod;

public class CalculatorMod {

    int[] numArray = new int[3];
    String[] signArray = {"+", "-", "*", "/", "%", "^"};
    String sign;

    void calculate() {
        switch(sign) {
            case "+" :
                System.out.println("Answer = " + Math.addExact(numArray[0],numArray[1]));
                break;
            case "-" :
                System.out.println("Answer = " + Math.subtractExact(numArray[0],numArray[1]));
                break;
            case "*" :
                System.out.println("Answer = " + Math.multiplyExact(numArray[0],numArray[1]));
                break;
            case "/" :
                System.out.println("Answer = " + Math.floorDiv(numArray[0],numArray[1]));
                break;
            case "%" :
                System.out.println("Answer = " + Math.IEEEremainder(numArray[0],numArray[1]));
                break;
            case "^" :
                System.out.println("Answer = " + Math.pow(numArray[0],numArray[1]));
                break;
        }
    }
}
