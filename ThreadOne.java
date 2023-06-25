/*
Name: Daniel Shiang
Date: 2-20-2023
Course: CS622 - Spring 1 2023
Description: This thread class is called by TryMultiThread class to generate
the 100 10 length sequences with a single thread.

This class contains the code inside run(). The array, char[] nucleotides, contains the nucleotides 'A', 'T', 'G', and
'C' which are to be generated in random sequences of 10 length.

The length of each sequence is determined here with int length.
The number of sequences is determined here as with int howManySequences.

generateRandomSequences method from Generator class is passed the length and nucleotides arguments.
 */
package bu.edu.hw4;

public class ThreadOne implements Runnable{

    @Override
    public void run() {

        //array containing A, T, G, C
        char[] nucleotides = {'A', 'T', 'C', 'G'};

        //create instance of Generator class
        Generator generate = new Generator();

        //number of gene snippets to generate
        int howManySequences = 20;

        //length of sequences
        int length = 10;

        //print
        for (int i = 0; i < howManySequences; i++) {
            System.out.println(generate.generateRandomSequence(length, nucleotides));

            //System.out.println("T1");
        }

    }


}
