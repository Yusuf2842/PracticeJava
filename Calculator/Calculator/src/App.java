import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String input;

        do {
            System.out.println("Enter a number (Type 'Exit' to quit): "); //Asks user for input
            input = scanner.nextLine(); //Scans for input

            if (input.equalsIgnoreCase("Exit")) {
                System.out.println("In the loop to break");
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("The number is: " + input);
                double[] numbers = new double[2];

            }
        } while (true);

        scanner.close();
    }
}