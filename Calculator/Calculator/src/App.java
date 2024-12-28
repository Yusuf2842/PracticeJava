import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in); 

        System.out.println("Calculate: "); //Print "Calculate"
        int numberInput = scanner.nextInt(); // Scan for next int
        System.out.println("The number is: " + numberInput); //Test line
    }
}
