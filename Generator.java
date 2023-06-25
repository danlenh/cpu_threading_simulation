package bu.edu.hw4;

/*
Name: Daniel Shiang
Date: 2-20-2023
Course: CS622 - Spring 1 2023
Description: This class has method generateRandomSequence, which takes in length and nucleotide arguments
from various thread classes. The length determines length of random characters generated. The nucleotide
array contains the characters used in this assignment 'A', 'T', 'C', 'G'

 */


import java.util.*;

public class Generator {

    //Method: generateRandomSequence
    //This method takes in int length and char[] nucleotides as arguments from various thread classes
    //Using Random class from utils, generate random sequences of length argument from nucleotides
    //Note: the method body was taken from ChatGPT and Stackoverflow
    public static String generateRandomSequence(int length, char[] nucleotides) {
        StringBuilder sb = new StringBuilder();
        Random rand = new Random();

        for (int i = 0; i < length; i++) {
            int index = rand.nextInt(nucleotides.length);
            sb.append(nucleotides[index]);
        }

        return sb.toString();
    }
}
