/**
 * Problem 2 - Hailstone.java
 *
 * Douglas Hofstadter, in his Pulitzer Prize-winning book "Gödel, Escher, Bach,"
 * introduced a fascinating mathematical puzzle called the Hailstone Sequence.
 * The challenge involves selecting an integer n and repeatedly applying the following rules until n becomes 1:
 *
 *  1. If n is odd, calculate 3n + 1.
 *  2. If n is even, divide n by 2.
 *
 * For example, if n starts at 15, the process produces the following sequence:
 * 
 *  15 is odd, so I make 3n + 1: 46
 *  46 is even, so I take half: 23
 *  23 is odd, so I make 3n + 1: 70
 *  70 is even, so I take half: 35
 *  35 is odd, so I make 3n + 1: 106
 *  106 is even, so I take half: 53
 *  ...
 *  2 is even, so I take half: 1
 *
 * The intriguing property of this sequence is that no matter which integer n is chosen,
 * the sequence always eventually reaches 1. This "hailstone" metaphor reflects how the value
 * of n rises and falls unpredictably, much like a hailstone caught in a storm.
 *
 * Task:
 * Write a program that allows the user to input an integer n and generates the Hailstone Sequence.
 * - The program should display all intermediate numbers in the sequence, including the operations performed.
 * - Additionally, it should count and display the number of steps required to reach 1.
 *
 * Output Example:
 * The program should format the output to match the example sequence shown above,
 * ensuring both the numbers and the descriptions are printed correctly.
 */

import java.util.Scanner;

public class Hailstone{

    public static int steps = 0;
    public static void main(String[] args){
        /* the preface of Hailstone */
        System.out.println("This program computes Hailstone sequences");
        System.out.println("");
        System.out.print("Enter a number: ");

        /* Create a box for number that is going to be entered */
        Scanner inputScanner = new Scanner(System.in);
        int input = inputScanner.nextInt();

        /* Create Hailstone order */
        while (input != 1){
            if (input%2 == 1){
                System.out.print(input);
                input = input * 3 + 1;
                System.out.println(" is odd, so I make 3n+1: " + input);
                steps += 1;

            } else if (input%2 == 0){
                System.out.print(input);
                input /= 2;
                System.out.println(" is even, so I take half: " + input);
                steps += 1;
            }
        }
        System.out.println("It took " + steps + " steps to reach 1.");
    }   
}