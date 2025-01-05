/**
 * Problem 5 - NarcissisticChecker.java
 *
 * In the world of number theory, a positive integer is called a Narcissistic number
 * (also known as Armstrong number, PPDI, or pluperfect digital invariant) if the sum
 * of its digits raised to the power of the number of digits equals the number itself.
 *
 * For example:
 * - 153 = 1^3 + 5^3 + 3^3, so 153 is a Narcissistic number.
 * - 1634 = 1^4 + 6^4 + 3^4 + 4^4, so 1634 is a Narcissistic number.
 * - 92727 = 9^5 + 2^5 + 7^5 + 2^5 + 7^5, so 92727 is a Narcissistic number.
 *
 * Task:
 * Write a program `NarcissisticChecker.java` that allows users to input an integer
 * and determines whether it is a Narcissistic number. The program should:
 * 1. Prompt the user to input an integer.
 * 2. Calculate the sum of each digit raised to the power of the number of digits.
 * 3. Compare the calculated sum with the input number.
 * 4. Output whether the number is a Narcissistic number or not.
 *
 * Notes:
 * - A Narcissistic number must be a positive integer.
 * - The program should be user-friendly and display results clearly.
 *
 * Example Input/Output:
 * -----------------------------------------
 * Enter a number: 153
 * 153 is a Narcissistic number.
 * 
 * Enter a number: 9474
 * 9474 is a Narcissistic number.
 * 
 * Enter a number: 123
 * 123 is not a Narcissistic number.
 * -----------------------------------------
 *
 * Implementation Tips:
 * - Use mathematical operations (modulus and division) to extract digits of the number.
 * - Use loops to iterate through each digit.
 * - Avoid processing negative numbers by checking the input at the start.
 */

import java.util.Scanner;

public class NarcissisticChecker{

    public static int EXIT = -100;
    public static void main(String[] args){

        /* the preface of NarcissisticChecker */
        System.out.println("Welcome to the narcissistic number checker!");
        System.out.print("n: ");

        /* create the box for the number that are going to be typed */
        Scanner narcissScanner = new Scanner(System.in);
        int narciss = narcissScanner.nextInt();

        /* narcissistic checker */
        while (narciss != EXIT){
            
            /* Initialize variables */
            int result = 0;
            int length = 0;

            /* calculate length */
            int temp = narciss;
            for (; temp >0; temp /= 10 ){
                length++; 
            }
            
            /* calculate barcissistic result */
            temp = narciss;
            for (; temp >0; temp /= 10 ){
                int digit = temp % 10;
                result += Math.pow(digit, length);
            }

            /* print the result */
            if (narciss == result){
                System.out.println(narciss + " is a narcissistic number");
            } else{
                System.out.println(narciss + " is not a narcissistic number");
            }

            /* Ask user to type new n */
            System.out.print("n: ");
            narcissScanner = new Scanner(System.in);
            narciss = narcissScanner.nextInt();

        }
        System.out.println("Have a good one! ");
    }


    
}