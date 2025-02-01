// This program finds the best matching DNA subsequence.
// Users input a long DNA sequence and a short DNA segment.
// The program finds the most similar part of the long sequence
// using a sliding window approach and prints the best match.

import java.util.*;

public class Similarity{

    public static void main(String[] args){

        Scanner longScanner = new Scanner(System.in);
        Scanner shortScanner = new Scanner(System.in);

        // Input long and short sequences
        System.out.print("Please give me a DNA sequence to search: ");
        String longSequence = longScanner.nextLine().toUpperCase();

        System.out.print("What DNA sequence would you like to match? ");
        String shortSequence = shortScanner.nextLine().toUpperCase();

        // Find the best match
        String BestMatch = findBestMatch(longSequence, shortSequence);

        // Output the best match
        System.out.println("The best match is " + BestMatch);

    }

    // Function to find the best matching substring
    public static String findBestMatch(String longSequence, String shortSequence){

        int maxSimilarity = 0;
        String bestMatch = "";

        int longLength = longSequence.length();
        int shortLength = shortSequence.length();

        for (int i=0; i<=longLength-shortLength; i++){
            String subSeq = longSequence.substring(i, i+shortLength);
            int Similarity = calculateSimilarity(subSeq, shortSequence);

            if (Similarity > maxSimilarity){
                maxSimilarity = Similarity;
                bestMatch = subSeq;
            }
        }
        return bestMatch;
    }

    // Function to calculate similarity between two sequences
    public static int calculateSimilarity(String subSeq, String shortSequence){

        int count = 0;
        for (int i=0; i<subSeq.length(); i++){
            if (subSeq.charAt(i)==shortSequence.charAt(i)){
                count++;
            }
        }
        return count;
    }
}