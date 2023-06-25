/*
Name: Daniel Shiang
Date: 2-20-2023
Course: CS622 - Spring 1 2023
Description: 5 different thread classes are instantiated as 5 different thread objects in this class.

This class contains the main method, in which classes ThreadOne, ThreadTwo, ThreadThree, ThreadFour, and ThreadFive
 classes are instantiated, five threads are instantiated from each of these classes.
 Each thread, using the randomSequenceGenerator method from Generator class, 20 10 length sequences of 'A', 'T', 'C',
 and 'G' are printed.

Runtime is measured and printed.
 */

package bu.edu.hw4;

public class TryMultiThread {

    public static void main(String[] args) throws InterruptedException {

//Multithread running with multiple thread classes-------------------------------
        System.out.println("Multi thread run with different thread classes");
        System.out.println("Generate 100 base pair sequences of 10 length");



        //create respective instances of ThreadOne, ThreadTwo...ThreadFive classes here
        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();
        ThreadThree t3 = new ThreadThree();
        ThreadFour t4 = new ThreadFour();
        ThreadFive t5 = new ThreadFive();

        //instantiate the Thread objects here
        Thread t1Start = new Thread(t1);
        Thread t2Start = new Thread(t2);
        Thread t3Start = new Thread(t3);
        Thread t4Start = new Thread(t4);
        Thread t5Start = new Thread(t5);

        //start timer in ms
        long startTime = System.nanoTime();

        //Create new thread and JVM assigns to a CPU core
        t1Start.start();
        t2Start.start();
        t3Start.start();
        t4Start.start();
        t5Start.start();

        //end timer and get difference of time run in ms
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("Total running time: " + totalTime + " ns");

    }
}
