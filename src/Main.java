import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        double radius;
        System.out.println("Type in the radius");
        radius = a.nextDouble();
        double area = Math.pow(radius, 2) * Math.PI;
        System.out.println("Your area is = " + area);

    }
}

