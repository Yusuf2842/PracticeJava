import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String input;

        do {
            System.out.println("Press Enter to Continue."); //Asks user for input and terminates if 'exit
            System.out.println("Type 'Exit' to quit.");
            input = scanner.nextLine(); //Scans for input

            if (input.equalsIgnoreCase("Exit")) { //Checks if user typed exit
                System.out.println("In the loop to break");
                System.out.println("Goodbye!");
                break;
            } else {
                double[] numbers = new double[2]; //Initialize double array
                for (int i = 0; i < numbers.length; i++) { //For loop to add user input into the array.
                    System.out.println("Enter first number: ");
                    if (scanner.hasNextDouble()) {
                        numbers[i] = scanner.nextDouble();
                    } else {
                        System.out.println("Invalid input, please enter a number.");
                        scanner.next();
                    }
                    scanner.nextLine();
                }
                System.out.println("Array contents: " + Arrays.toString(numbers));
                for (int i = 0; i < numbers.length; i++) { //TODO: Try to figure out how to use the two numbers in the array and apply an operator on them.

                }
            }
        } while (true);

        scanner.close();
    }
}