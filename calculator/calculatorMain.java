package calculator;

import java.util.Scanner;

public class calculatorMain {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        boolean programRunning = true;

        System.out.println("---Basic Calculator---");

        calculatorClass calculator = new calculatorClass();

        while (programRunning) {
            
            System.out.println("");
            System.out.println("1. Start\n2. End");

            int selection = scnr.nextInt();
            scnr.nextLine();
            System.out.println();
            
            switch (selection) {
                case 1:
                    System.out.println("Hello");
                    break;
                case 2:
                    System.out.println("Goodbye");
                    programRunning = false;
                    break;
                default:
                    System.out.println("Invalid Entry");
            }

        }

    }

    

}
