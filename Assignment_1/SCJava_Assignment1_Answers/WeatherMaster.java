/**
 * Problem 3 - WeatherMaster.java
 *
 * The Central Weather Bureau needs help processing temperature data, 
 * and as a stanCode student, your task is to create a program that automates this job.
 *
 * The program needs to calculate and display the following statistics based on all input temperatures:
 *  1. The highest temperature recorded.
 *  2. The lowest temperature recorded.
 *  3. The average temperature.
 *  4. The number of "cold days" (days with temperatures below 16°C, not including 16°C itself).
 *
 * How it works:
 * - The program continuously prompts the user to input integer temperatures.
 * - The user can terminate the program by entering the special value `-100`.
 * - To make the code more flexible and organized, the special value `-100` should be stored as a constant in the `main()` method.
 * - The program should compute and display all the required statistics after the user chooses to quit.
 *
 * Example Output:
 * -----------------------------------------
 * stanCode "Weather Master 4.0!"
 * Next Temperature (or -100 to quit): 20
 * Next Temperature (or -100 to quit): 16
 * Next Temperature (or -100 to quit): 8
 * Next Temperature (or -100 to quit): 13
 * Next Temperature (or -100 to quit): 19
 * Next Temperature (or -100 to quit): 24
 * Next Temperature (or -100 to quit): 33
 * Next Temperature (or -100 to quit): 31
 * Next Temperature (or -100 to quit): -100
 * Highest temperature = 33
 * Lowest temperature = 8
 * Average = 20.5
 * 2 cold day(s)
 * -----------------------------------------
 *
 * Notes:
 * - The program must be user-friendly and should display prompts for user input.
 * - Use appropriate loops and conditionals to calculate the statistics.
 * - Ensure the program handles edge cases, such as no valid temperatures entered before quitting.
 */

import java.util.Scanner;

public class WeatherMaster{

    public static final int EXIT = -100;

    public static void main(String[] args){

        /* the preface of WeatherMaster */
        System.out.println("stanCode \"Weather Master 4.0\"! ");
        System.out.print("Next Temperature: (or "+ EXIT +" to quit)? ");

        /* create a box to store temperature */
        Scanner tempScanner = new Scanner(System.in);
        int temp = tempScanner.nextInt();

        /* start to calcualte the temperature */
        if (temp == EXIT){

            /* Check if user wants to quit */
            System.out.println("No temperatures were entered. ");

        } else{

            /* input temperatures and calculate the highest, the lowest, average, and how many days are under 16(cold days) */
            /* Initialize variables */
            double total = 0;
            double number = 0;
            int highest = temp;
            int lowest = temp;
            int cold = 0;

            while (temp != EXIT){

                /* Update statistics */
                total += temp;
                number += 1;

                if (temp > highest){
                    highest = temp;
                }
                if (temp < lowest){
                    lowest = temp;
                }
                if (temp < 16){
                    cold += 1;
                }

                /* Ask user to type new temperature */
                System.out.print("Next Temperature: (or " + EXIT + " to quit)? ");
                tempScanner = new Scanner(System.in);
                temp = tempScanner.nextInt();
            }

             /* Print the results */
            System.out.println("Highest temperature = " + highest);
            System.out.println("Lowest temperature = " + lowest);
            System.out.println("Average = " + (total/number));
            System.out.println(cold + " cold day(s)");
        }
    }   
}