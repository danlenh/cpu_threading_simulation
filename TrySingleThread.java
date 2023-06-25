package bu.edu.hw4;

/*
Name: Daniel Shiang
Date: 2-20-2023
Course: CS622 - Spring 1 2023
Description: A single thread is used in this class.,

This class contains the main method, in which SingleThread class is instantiated, then a
single thread is instantiated. Using the randomSequenceGenerator method from Generator class, 100
10 length sequences of 'A', 'T', 'C', and 'G' are printed.

Runtime is measured and printed.
 */

public class TrySingleThread {

    public static void main(String[] args) {

        //message
        System.out.println("Single thread run to generate 100 base pairs of 10 length");

        //instantiate SingleThread class
        SingleThread s1 = new SingleThread();
        //instantiate s1 as a Thread
        Thread s1Start = new Thread(s1);

        //start timer
        long startTime = System.nanoTime();

        //Create a new thread and JVM assigns to a CPU core
        s1Start.start();

        //end timer and get difference of time run in ns
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("Total running time: " + totalTime + " ns");

    }
}
