package playground;

public class LastDigitChecker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(9, 99, 999));
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {

        if (isValid(num1) && isValid(num2) && isValid(num3)) {
            int num1Last = num1 % 10;
            int num2Last = num2 % 10;
            int num3Last = num3 % 10;

            return ((num1Last == num2Last) || (num1Last == num3Last) || (num2Last == num3Last));
        } 

        return false;
    }

    public static boolean isValid(int num) {
        if ((num < 10) || (num > 1000)) {
            return false;
        } else {
            return true;
        }
    }
}