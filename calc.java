import java.util.Scanner;

public class calc {
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double first = input.nextDouble();

        System.out.print("Enter second number: ");
        double second = input.nextDouble();

        System.out.print("Choose operation (+, -, *, /): ");
        char operator = input.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = add(first, second);
                break;
            case '-':
                result = subtract(first, second);
                break;
            case '*':
                result = multiply(first, second);
                break;
            case '/':
                result = divide(first, second);
                break;
            default:
                System.out.println("Invalid operator selected.");
                return;
        }

        System.out.println("Result: " + result);
        input.close();
    }
}
