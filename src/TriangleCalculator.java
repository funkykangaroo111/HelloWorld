import java.util.Scanner;

public class TriangleCalculator {
    public static void run() {
        // Variables
        double height;
        double baseLength;

        // Getting Input
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Type in the height of the triangle");
        height = inputScanner.nextDouble();
        System.out.println("Now type in the base length");
        baseLength = inputScanner.nextDouble();

        // Calculating
        double area = height * baseLength / 2;

        // Output
        System.out.println("Your area is =" + area);
    }
}
