import java.util.Scanner;

public class Calculator {
    public static void calc() {
        double x;
        double y;
        int type;
        Scanner inputScanner = new Scanner(System.in);

        do {

        System.out.println("Addition = 1 Subtraction = 2 Multiplication = 3 Divison = 4. Type 5 to exit.");
        type = inputScanner.nextInt();
        switch(type) {
            case 1:
                System.out.println("Addition selected. Enter two numbers in the following format : x y");
                x = inputScanner.nextDouble();
                y = inputScanner.nextDouble();
                double addition = x + y;
                System.out.println("Answer = " + addition);
                break;

            case 2:
                System.out.println("Subtraction selected. Enter two numbers in the following format : x y");
                x = inputScanner.nextDouble();
                y = inputScanner.nextDouble();
                double subtraction = x - y;
                System.out.println("Answer = " + subtraction);
                break;

            case 3:
                System.out.println("Multiplication selected. Enter two numbers in the following format : x y");
                x = inputScanner.nextDouble();
                y = inputScanner.nextDouble();
                double multiplication = x * y;
                System.out.println("Answer = " + multiplication);
                break;

            case 4:
                System.out.println("Division selected. Enter two numbers in the following format : x y");
                x = inputScanner.nextDouble();
                y = inputScanner.nextDouble();
                double division = x / y;
                System.out.println("Answer = " + division);


            default:
                System.out.println("Please type a number between 1 - 4. If you want to exit then type 5. Thank you!");
                break;
            }
        }while(type != 5);
    }
}
