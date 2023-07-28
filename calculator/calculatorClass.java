package calculator;

import java.util.Scanner;

public class calculatorClass {

    public Scanner scnr = new Scanner(System.in);

    private String userExpression;
    private double additionExpression;
    private double subtractionExpression;
    private double multiplicationExpression;
    private double divisionExpression;

    /**
     * Creates new instance of calculatorClass
     * Initializes 'userExpression' to empty string as placeholder
     */
    public calculatorClass() {
        this.userExpression = "";
    }

    /**
     * Prompts user to enter mathematical expression and sets it as the user expression.
     * This method will keep prompting user until valid expression is entered.
     * The expression will be validated usng the {@link #isValidInput(String)} method.
     * If user enters invalid expression, an error message will be displayed,
     * and the user is prompted to try again.
     * 
     * @throws NoSuchElementException if the input stream is closed.
     */
    public void promptUserExpression() {
        String input;
        boolean validInput;
        do {
            System.out.println("Enter expression: ");
            input = scnr.nextLine();
            validInput = isValidInput(input);
            if (!validInput) {
                System.out.println("Invalid expression! Please try again.");
            } else {
                System.out.println("Bruh");
                setUserExpression(input);
            }
        } while (!validInput);
    }

    /**
     * Checks if the input is a valid input.
     * @param input The input string to be validated
     * @return {@code true} if the input is a valid expression, {@code false} otherwise.
     */
    private boolean isValidInput(String input) {
        return input.matches("^[0-9+\\-*/\\s]+$");
    }

    /**
     * Sets 'this.userExpression' with the input.
     * @param input The input string that is set as the user expression.
     */
    private void setUserExpression(String input) {
        this.userExpression = input;
    }

    /**
     * Gets the user number stored in the calculator.
     * @return The user number as double
     */
    public String getUserExpression() {
        return this.userExpression;
    }

    /**
     * Adds the value of the modifying number to the user number
     * and the result is stored as the new user number.
     * Use {@link #setUserNumber(double)} to set the initial user number.
     */
    // public void additionMethod() {
    //     double sum = this.userNumber += this.modifyingNumber;
    //     setUserNumber(sum);
    // }

    /**
     * Subtracts the value of the modifying number to the user number
     * and the result is stored as the new user number.
     * Use {@link #setUserNumber(double)} to set the initial user number.
     */
    // public void subtractionMethod() {
    //     double difference = this.userNumber - this.modifyingNumber;
    //     setUserNumber(difference);
    // }

    /**
     * Multiplies the values of the modifying number to the user number
     * and the result is stored as the new user number.
     * Use {@link #setUserNumber(double)} to set the initial user number.
     */
    // public void multiplicationMethod() {
    //     double product = this.userNumber * this.modifyingNumber;
    //     setUserNumber(product);
    // }

    public double multiplicationMethod(String expression) {
        String[] factors = expression.split("\\*|/");
        double multiplier = Double.parseDouble(factors[0]);
        for (int i = 1; i < factors.length; i += 2) {
            double factor = Double.parseDouble(factors[i + 1]);
            if (factors[i].equals("*")) {
                multiplier += factor;
            } else {
                multiplier /= factor;
            }
        }
        return multiplier;
    }

    /**
     * Divides the values of the modifying number to the user number
     * and the result is stored as the new user number.
     * Use {@link #setUserNumber(double)} to set the initial user number.
     */
    // public void divisionMethod() {
    //     double quotient = this.userNumber / this.modifyingNumber;
    //     setUserNumber(quotient);
    // }

    private double evaluateAdditionSubtraction(String expression) {
        String[] terms = expression.split("\\+|-");
        double total = 0.0;
        for (String term : terms) {
            if (term.contains("*") || term.contains("/")) {
                // Evaluate multiplication and division
            } else {
                // Evaluate addition and subtraction
            }
        }
        return total;
    }

    // public String removeWhitespace(String input) {
    //     return input.replaceAll("\\s", "");
    // }

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        calculatorClass myCalculator = new calculatorClass();

        myCalculator.promptUserExpression();
        // String expression = scnr.nextLine();

        String test = myCalculator.getUserExpression();
        System.out.println(test);
    }

}