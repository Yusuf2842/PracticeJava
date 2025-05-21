package playground;

public class EvenDigitSum {

    public static void main(String[] args) {
        int bruh = getEvenDigitSum(-22);
        System.out.println(bruh);
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int temp = number;
        int sum = 0;
        while (temp > 0) {
            int lastDigit = temp % 10;
            if ((lastDigit % 2) == 0) {
                sum += lastDigit;
                temp /= 10;
            } else {
                temp /= 10;
            }
        }
        return sum;
    }
}