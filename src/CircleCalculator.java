import java.util.Scanner;

public class CircleCalculator {
    public static void run() {
        // Variables
        double radiusDouble;
        double areaDouble;
        Scanner inputScanner = new Scanner(System.in);

        // Input
        System.out.println("Type in the radius");
        radiusDouble = inputScanner.nextDouble();

        // Process
        areaDouble = calculateCircleArea(radiusDouble);

        // Output
        System.out.println("Your area is = " + areaDouble);
    }

    public static double calculateCircleArea(double radiusDouble) {
        double areaDouble = Math.pow(radiusDouble, 2) * Math.PI;
        return areaDouble;
    }
}
