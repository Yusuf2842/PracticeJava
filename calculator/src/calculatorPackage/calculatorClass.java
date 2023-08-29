package calculatorPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class calculatorClass {

    public Scanner scnr = new Scanner(System.in);

    private String userExpression;
    ArrayList<Character> multAndDivOperator;
    ArrayList<Character> addAndSubOperator;
    ArrayList<Character> numbers;

    /**
     * Creates new instance of calculatorClass
     * Initializes 'userExpression' to empty string as placeholder
     */
    public calculatorClass() {
        this.userExpression = "";
        this.multAndDivOperator =  new ArrayList<>();
        this.addAndSubOperator =  new ArrayList<>();
        this.numbers =  new ArrayList<>();
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
        String whitespaceRemovedInput;
        boolean validInput;
        do {
            System.out.println("Enter expression: ");
            input = scnr.nextLine();
            validInput = isValidInput(input);
            whitespaceRemovedInput = removeWhitespace(input);
            if (!validInput) {
                System.out.println("Invalid expression! Please try again.");
            } else {
                System.out.println("2. Pass 'promptUserExpression");
                setUserExpression(whitespaceRemovedInput);
                System.out.println("3. Pass 'removeWhiteSpace'");
            }
        } while (!validInput);
    }

    /**
     * Checks if the input is a valid input.
     * @param input The input string to be validated
     * @return {@code true} if the input is a valid expression, {@code false} otherwise.
     */
    private boolean isValidInput(String input) {
        System.out.println("1. Pass 'isValidInput'");
        return input.matches("^[0-9+\\-*/\\s]+$");
    }

    /**
     * Removes whitespace from input String.
     * @param input The input string to be cleaned of whitespace
     * @return String that is removed of whitespace
     */
    public String removeWhitespace(String input) {
        return input.replaceAll("\\s", "");
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
     * @return The user number as string
     */
    public String getUserExpression() {
        return this.userExpression;
    }

    private void evaluateExpression(String expression) {
        char[] individualCharacters = expression.toCharArray();
        double currentResult = 0.0;

        for (int i = 0; i < individualCharacters.length; i++) {
            char currentChar = individualCharacters[i];
            if (isMultOrDiv(currentChar)) {
                this.multAndDivOperator.add(currentChar);
                evaluateMultiplicationAndDivision(numbers, multAndDivOperator);
            } else if (isAddOrSub(currentChar)) {
                this.addAndSubOperator.add(currentChar);
                evaluateMultiplicationAndDivision(numbers, addAndSubOperator);
            } else {
                this.numbers.add(currentChar);
            }
        }
    }

    /**
     * Checks if the character is an operator
     * @param operator The character to check
     * @return {@code true} if the character is one of the operators ('+','-','*','/'),
     * {@code false} otherwise
     */
    private boolean checkIfOperator(char operator) {
        return (operator == '+') || (operator == '-') || (operator == '/') || (operator == '*');
    }

    /**
     * Checks if the character is a multiplication or division operator
     * @param operator The character to check
     * @return {@code true} if the character is either '*' or '/',
     * {@code false} otherwise
     */
    private boolean isMultOrDiv(char operator) {
        return (checkIfOperator(operator) && ((operator == '*') || (operator == '/')));
    }

    /**
     * Checks if the character is a addition or subtraction operator
     * @param operator The character to check
     * @return {@code true} if the character is either '+' or '-',
     * {@code false} otherwise
     */
    private boolean isAddOrSub(char operator) {
        return (checkIfOperator(operator) && ((operator == '+') || (operator == '-')));
    }

    private void evaluateMultiplicationAndDivision(ArrayList<Character> numbers, ArrayList<Character> operators) { //#TODO: Work on this
    
    }

    private void evaluateAdditionAndSubtraction(ArrayList<Character> numbers, ArrayList<Character> operators) {
        System.out.println("");
    }
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        calculatorClass myCalculator = new calculatorClass();

        myCalculator.promptUserExpression();
        // String expression = scnr.nextLine();

        String test = myCalculator.getUserExpression();
        System.out.println("Output: " + test);
        myCalculator.evaluateExpression(test);
    }

}