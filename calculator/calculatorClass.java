package calculator;

import java.util.Scanner;

public class calculatorClass {

    private Scanner scnr = new Scanner(System.in);

    private double userNumber;
    private double modifyingNumber;

    /**
     * Creates new instance of calculatorClass
     * Initializes 'userNumber' and 'modifyingNumber' to 0
     */
    public calculatorClass() {
        this.userNumber = 0;
        this.modifyingNumber = 0;
    }

    /**
     * Gets the user number stored in the calculator.
     * @return The user number as double
     */
    public double getUserNumber() {
        return userNumber;
    }

    /**
     * Sets the user number in the calculator to the specified value
     * @param number The value to set as the user number
     */
    private void setUserNumber(double number) {
        this.userNumber = number;
    }

    /**
     * Sets the modifying number in the calculator to the specified value
     * @param number The value to set as the modifying number
     */
    private void setModifier(double number) {
        this.modifyingNumber = number;
    }

    /**
     * Adds the value of the modifying number to the user number
     * and the result is stored as the new user number.
     * Use {@link #setUserNumber(double)} to set the initial user number.
     */
    public void additionMethod() {
        double sum = this.userNumber += this.modifyingNumber;
        setUserNumber(sum);
    }

    /**
     * Subtracts the value of the modifying number to the user number
     * and the result is stored as the new user number.
     * Use {@link #setUserNumber(double)} to set the initial user number.
     */
    public void subtractionMethod() {
        double difference = this.userNumber - this.modifyingNumber;
        setUserNumber(difference);
    }

    /**
     * Multiplies the values of the modifying number to the user number
     * and the result is stored as the new user number.
     * Use {@link #setUserNumber(double)} to set the initial user number.
     */
    public void multiplicationMethod() {
        double product = this.userNumber * this.modifyingNumber;
        setUserNumber(product);
    }

    /**
     * Divides the values of the modifying number to the user number
     * and the result is stored as the new user number.
     * Use {@link #setUserNumber(double)} to set the initial user number.
     */
    public void divisionMethod() {
        double quotient = this.userNumber / this.modifyingNumber;
        setUserNumber(quotient);
    }

    public void pemdas() {

    }

    public String removeWhitespace(String input) {
        return input.replaceAll("\\s", "");
    }

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        calculatorClass myCalculator = new calculatorClass();

        String bruh = scnr.nextLine();
        String bruhMoment = myCalculator.removeWhitespace(bruh);
        System.out.println(bruhMoment);
    }

}