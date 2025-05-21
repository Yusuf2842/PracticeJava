package playground;

public class NumberPalindrome{

    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }

    public static boolean isPalindrome(int number) {
        int original = Math.abs(number);
        int reverse = 0;
        int temp = original;
        while (temp > 0) {
            int lastDigit = temp % 10;
            reverse = reverse * 10;
            reverse += lastDigit;
            temp /= 10;
        }
        return original == reverse;
    }
}