package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private String strExp;
    private String[] divStrExp;
    private String delimiter = " ";

    public void setStrExp(String strExp) {
        this.strExp = strExp;
    }

    private int firstNum;
    private int secNum;
    private String sign;

    void calculate() {
        divStrExp = strExp.split(delimiter);
        firstNum = Integer.parseInt(divStrExp[0]);
        secNum = Integer.parseInt(divStrExp[2]);
        sign = divStrExp[1];

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
