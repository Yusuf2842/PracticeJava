package playground;

public class whileLoopChallenge {

    public static void main(String[] args) {
        int startNum = 5;
        int endNum = 20;
        int evenCount = 0;
        int oddCount = 0;
        while ((startNum <= endNum)) {
            startNum ++;
            if (!isEvenNumber(startNum)) {
                oddCount++;
                continue;
            }
            evenCount++;
            if (evenCount == 5) {
                break;
            }
            System.out.println("Even number " + startNum);
        }
        System.out.println("Total odd numbers: " + oddCount);
        System.out.println("Total even numbers: " + evenCount);
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}