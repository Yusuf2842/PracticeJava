package playground;

public class DigitSum{

    public static void main(String[] args) {
        int test = sumDigits(32123);
        System.out.println(test);
    }

    public static int sumDigits(int number) {
         if (number < 0) {
            return -1;
         } else {
            int sum = 0;
            while (number > 0) {
                int numRemainder = number % 10;
                sum += numRemainder;
                number = number / 10;
            }
            return sum;
         }
    }
}