import  java.util.Scanner;
public class Calsi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an 1st number for arithmetic operations :");
        double num1 = sc.nextDouble();
        System.out.println("Enter an 2nd number opertions:");
        double num2 = sc.nextDouble();
        double a = num1 + num2;
        double b = num1 - num2;
        double c = num1 * num2;
        double d = num1 / num2;
        System.out.println("Addition of two numbers is : "  +a);
        System.out.println("Subtraction of two numbers is : "  +b);
        System.out.println("Multiplication of two numbers is : " + c);
        System.out.println("Division of two numbers is : " + d);
    }

}