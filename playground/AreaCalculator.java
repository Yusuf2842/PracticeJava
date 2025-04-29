package playground;

public class AreaCalculator {

    public static void main(String[] args) {

        double areaCircle = area(5.0);
        System.out.println("The area of the circle with radius of 5.0 is " + areaCircle);

        double areaRectangle = area(5,4);
        System.out.println("The area of the rectangle with length 5 and width 4 is " + areaRectangle);
        
    }

    public static double area(double radius) {

        if (radius < 0) {
            return -1.0;
        }

        return (Math.PI * (radius * radius)); // A = Pi * r^2
    }

    public static double area(double x, double y) {
        if ((x < 0) || (y < 0)){
            return -1.0;
        }
        return (x * y);
    }

}