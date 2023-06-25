package bu.edu.hw4;

/*
Name: Daniel Shiang
Date: 2-20-2023
Course: CS622 - Spring 1 2023
Description: A single thread class is instantiated as 5 different thread objects in this class.

This class contains the main method, in which classes ThreadOne is instantiated.
From a single thread class, five threads are instantiated and 5 threads are created.
 Each thread, using the randomSequenceGenerator method from Generator class, 20 10 length sequences of 'A', 'T', 'C',
 and 'G' are printed.

 Runtime is measured and printed.
 */

public class TryMultiThreadSingleClass {

    public static void main(String[] args) throws InterruptedException {

//Multithread running with multiple thread classes-------------------------------
        System.out.println("Multi thread run with single thread class");
        System.out.println("Generate 100 base pair sequences of 10 length");



        //create instances of single ThreadOne class here
        ThreadOne t1 = new ThreadOne();
        ThreadOne t2 = new ThreadOne();
        ThreadOne t3 = new ThreadOne();
        ThreadOne t4 = new ThreadOne();
        ThreadOne t5 = new ThreadOne();

        //instantiate the above as Threads objects here
        Thread t1Start = new Thread(t1);
        Thread t2Start = new Thread(t2);
        Thread t3Start = new Thread(t3);
        Thread t4Start = new Thread(t4);
        Thread t5Start = new Thread(t5);

        //start timer in ns
        long startTime = System.nanoTime();

        //Create new thread and JVM assigns to a CPU core
        t1Start.start();
        t2Start.start();
        t3Start.start();
        t4Start.start();
        t5Start.start();

        //end timer and get difference of time run in ns
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("Total running time: " + totalTime + " ns");

    }

}
