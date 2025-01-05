/**
 * Problem 1 - QuadraticSolver.java
 *
 * Assume we have a quadratic equation in the following form (where a is not equal to zero):
 *    ax^2 + bx + c = 0
 *
 * Given three values a, b, and c from the user, we can calculate the roots of the equation (values of x)
 * using the following formula:
 *    x = (-b ± √(b^2 - 4ac)) / (2a)
 *
 * The term b^2 - 4ac inside the square root is called the discriminant:
 *  1. If the discriminant is greater than zero, the equation will have two real roots (two values of x).
 *  2. If the discriminant equals zero, the equation will have one root (one value of x).
 *  3. If the discriminant is less than zero,we should inform the user that there are "No real roots".
 *
 * Please write a program to solve this problem based on the above rules.
 */

import java.util.Scanner;

public class QuadraticSolver{
    public static void main(String[] args){
        /* Make scanners of each algebra */
        Scanner aScanner = new Scanner(System.in);
        Scanner bScanner = new Scanner(System.in);
        Scanner cScanner = new Scanner(System.in);

        /* Type each algebra */
        System.out.print("Enter a: ");
        int a = aScanner.nextInt();
        System.out.print("Enter b: ");
        int b = bScanner.nextInt();
        System.out.print("Enter c: ");
        int c = cScanner.nextInt();

        /* Make the defination of x */
        if ((b*b - 4*a*c) > 0){
            double ans1 = ((-b + Math.sqrt(b*b - 4*a*c)))/ (2*a);
            double ans2 = ((-b - Math.sqrt(b*b - 4*a*c)))/ (2*a);
            System.out.println("Two roots: " + ans1 + ", " + ans2);
        } else if((b*b - 4*a*c) == 0){
            double ans1 = ((-b + Math.sqrt(b*b - 4*a*c)))/ (2*a); 
            System.out.println("One root: " + ans1);          
        } else if((b*b - 4*a*c) < 0){
            System.out.println("No real roots1 "); 
        }
    }
}