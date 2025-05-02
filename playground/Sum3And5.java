package playground;

public class Sum3And5 {

    /**
     * @param args
     */
    public static void main(String[] args) {
     
        int sum = 0;
        int sumCount = 0;
        for (int i = 1; (sumCount <= 4) && (i <= 1000); i++) { 
            System.out.println("This is the loop");
            if (((i % 3) == 0) && ((i % 5) == 0)) {
                System.out.println("The number is " + i);
                sum += i;
                sumCount++;
            }
        }
        System.out.println("The total is: " + sum);
    }
}