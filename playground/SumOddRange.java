package playground;

public class SumOddRange{

    public static void main(String[] args) {
        
        int test = sumOdd(10, 5);
        System.out.println(test);
    }

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        }

        if (number % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static int sumOdd(int start, int end) {
        if ((start < 0) || ((end < 0) || (end < start))) {
            return -1;
        }

        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                int oddNum = i;
                sum += oddNum;
            }
        }

        return sum;
    }
}
