package playground;

public class FactorPrinter{

    public static void main(String[] args) {
        printFactors(-1);
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        } else {
            int count = number;
            for (int i = 1; i <= count; i++) {
                int isFactor = number % i;
                if (isFactor == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }

}