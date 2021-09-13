package com.company;
import java.util.Scanner;

public class Main {

    public static void roots (int a, int b, int c) {
        double xPlus;
        double xMinus;
        double powHolder = Math.pow(b, 2) - 4 * a * c;
        double sqrtHolder = Math.sqrt(powHolder);
        double divide = 2 * a;

        if (powHolder >= 0 && divide > 0) {
            xMinus = (-(b) - sqrtHolder) / divide;
            xPlus = (-(b) + sqrtHolder) / divide;

            if (Double.isNaN(xMinus) && Double.isNaN(xPlus)) {
                System.err.println("There are no solution to this!");
            } else if (xMinus == xPlus) {
                System.out.print("Only one solution: ");
                System.out.println(xMinus);
            } else {
                System.out.println("- = " + xMinus);
                System.out.println("+ = " + xPlus);
            }

            ax2(a, b, c, xMinus, xPlus);
        } else {
            System.err.println("You should not divide by 0 or take the square of a negative number!");
        }
    }

    public static void ax2 (int a, int b, int c, double x, double x2) {
        double resultMinus = a * Math.pow(x, 2) + b * x + c;
        double resultPlus = a * Math.pow(x2, 2) + b * x2 + c;

        if (resultMinus == resultPlus) {
            System.out.println("ax2 + bx + c = 0");
            System.out.println("" + a + " * " + x + "^2 + "+ b + " * " + x + " + " + c + " = " + resultMinus);
        } else {
            System.out.println("ax2 + bx + c = 0");
            System.out.println("" + a + " * " + x + "^2 + "+ b + " * " + x + " + " + c + " = " + resultMinus);
            System.out.println("" + a + " * " + x2 + "^2 + "+ b + " * " + x2 + " + " + c + " = " + resultMinus);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // find the roots of ax2 + bx + c
        System.out.println("find the roots of ax2 + bx + c = 0");
        System.out.print("Enter value for a: ");
        int a = scanner.nextInt();
        System.out.print("Enter value for b: ");
        int b = scanner.nextInt();
        System.out.print("Enter value for c: ");
        int c = scanner.nextInt();

        roots(a, b, c);

    }
}
