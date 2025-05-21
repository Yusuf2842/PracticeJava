package playground;

public class FirstLastDigitSum {

    public static void main(String[] args) {
        int number = sumFirstAndLastDigit(124);
        System.out.println(number);
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int lastDigit = number % 10;
        int firstDigit = number;
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }
        return lastDigit + firstDigit;
    }
}