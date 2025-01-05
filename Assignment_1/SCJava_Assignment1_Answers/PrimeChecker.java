/**
 * Problem 4 - PrimeChecker.java
 *
 * Jerry's younger brother asked an interesting question: "What exactly is a prime number?"
 * Jerry explained: "A prime number is a positive integer greater than 1 that cannot be divided
 * by any number other than 1 and itself." His brother then asked, "If I give you some numbers,
 * can you help me determine if they are prime?" Jerry responded, "Sure! Give me 20 minutes,
 * and I'll ask my classmates to write a program for it!"
 *
 * Task:
 * Write a program called `PrimeChecker.java` that allows a user to input numbers and determines
 * whether each number is a prime number. The program should:
 *  1. Prompt the user to input an integer `n`.
 *  2. Check whether `n` is a prime number.
 *  3. Output whether `n` is a prime number or not.
 *  4. If the user enters a negative number (e.g., -100), terminate the program with a friendly message.
 *
 * Input and Output Example:
 * -----------------------------------------
 * Welcome to the prime checker!
 * n: 17
 * 17 is a prime number.
 * n: 30
 * 30 is not a prime number.
 * n: -100
 * Have a good one!
 * -----------------------------------------
 *
 * Notes:
 * - A prime number is greater than 1 and divisible only by 1 and itself.
 * - Use loops or helper methods to check for prime numbers efficiently.
 * - Ensure the program is user-friendly and prints each prompt and result on a new line.
 */

import java.util.Scanner;

public class PrimeChecker{

    public static int EXIT = -100;

    public static void main(String[] args){

        /* the preface of PrimeChecker */
        System.out.println("Welcome to the prime checker!");
        System.out.print("n: ");

        /* create the box for the number that are going to be typed */
        Scanner primeScanner = new Scanner(System.in);
        int prime = primeScanner.nextInt();

        /* prime checker */
        while (prime != EXIT){
            for (int i=2; i<prime; i++){
                if (prime % i == 0){
                    System.out.println(prime + " is not a prime number.");
                    break;
                } else{
                    System.out.println(prime + " is a prime number.");
                    break;
                }
            }

            /* Ask user to type new n */
            System.out.print("n: ");
            primeScanner = new Scanner(System.in);
            prime = primeScanner.nextInt();
        }
        System.out.println("Have a good one! ");
    }
}