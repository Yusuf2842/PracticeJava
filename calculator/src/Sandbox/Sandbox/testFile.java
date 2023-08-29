package Sandbox;
import calculatorPackage.calculatorClass;

import java.util.ArrayList;
import java.util.List;


public class testFile {
    public void processExpression(char[] expression) {
        char currentOperator = ' ';
        double prevNumber = 0.0;
        double currentNumber = 0.0;
        List<Double> numbersList = new ArrayList<>();

        for (int i = 0; i < expression.length; i++) {
            char currentChar = expression[i];

            if (!checkIfOperator(currentChar)) { //TODO: Try to figure out how to get first number, operator, and second number
                double tempNumber = Character.getNumericValue(currentChar);
                numbersList.add(tempNumber);
            } else {
                System.out.println("Operator");
            }
        }
        for (Double number : numbersList) {
            System.out.print('[');
            System.out.print(number);
            System.out.print(']');
        }

        System.out.println("The # should be 1. NUMBER: " + currentNumber);
    }

    private boolean checkIfOperator(char operator) {
        return (operator == '+') || (operator == '-') || (operator == '/') || (operator == '*');
    }

    public static void main(String[] args) {
        calculatorClass myCalculator = new calculatorClass();
        myCalculator.promptUserExpression();
    }

}
