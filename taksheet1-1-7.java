import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        System.out.println("Division: " + divide(num1, num2));
    }
    
    public static double add(double num1, double num2) {
        return num1 + num2;
    }
    
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }
    
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }
    
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Cannot divide by zero.");
            return Double.NaN; // Return NaN (Not a Number) for division by zero
        }
        return num1 / num2;
    }
}
