package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private String srcMathExpression;
    private String[] splitMathExpression;

    public void setSrcMathExpression(String srcMathExpression) {
        this.srcMathExpression = srcMathExpression;
    }

    void calculate() {
        splitMathExpression = srcMathExpression.split(" ");
        int firstNum = Integer.parseInt(splitMathExpression[0]);
        int secNum = Integer.parseInt(splitMathExpression[2]);
        String sign = splitMathExpression[1];

        switch(sign) {
            case "+" :
                System.out.println("Answer = " + Math.addExact(firstNum,secNum));
                break;
            case "-" :
                System.out.println("Answer = " + Math.subtractExact(firstNum,secNum));
                break;
            case "*" :
                System.out.println("Answer = " + Math.multiplyExact(firstNum,secNum));
                break;
            case "/" :
                System.out.println("Answer = " + Math.floorDiv(firstNum,secNum));
                break;
            case "%" :
                System.out.println("Answer = " + Math.IEEEremainder(firstNum,secNum));
                break;
            case "^" :
                System.out.println("Answer = " + Math.pow(firstNum,secNum));
                break;
        }
    }
}
