README - Homework 4 - CS622 - Daniel Shiang

This homework submission consists of 10 classes: TrySingleThread, TryMultiThread, TryMultiThreadSingleClass, Generator, SingleThread, ThreadOne, ThreadTwo, ThreadThree, ThreadFour, and ThreadFive.

Experimental results and discussions will be discussed after the Program Operation and Class/method descriptions.  

Program Description:
The classes TrySingleThread, TryMultiThread, and TryMultiThreadSingleClass are used to explore the running times of multithread versus single thread running times. The TrySingleThread class runs a single thread from the SingleThread class to generate a hundred random nucleotide sequences ('A', 'T', 'C', 'G') of ten length. The TryMultiThread class utilizes five different thread classes: ThreadOne, ThreadTwo, ThreadThree, ThreadFour, and ThreadFive in order to create five respective thread objects to create twenty ten length sequences per thread. The TryMultiThreadSingleClass class creates five different thread objects from a single thread class, ThreadOne. Each thread object created from ThreadOne generates 20 different sequences of ten length. The Generator class contains a method to generate the random sequences of characters given an array argument and length argument.

The reason why two different multithread classes with different thread creation properties is represented here is in order to have a well rounded experimental result set, since creating different Thread objects from a single thread class versus multiple thread classes have different runtime results. 

Operation:
- Run the TrySingleThread class to retrieve results for a single threaded run.
- Run the TryMultiThread class to retrieve results for a multithreaded run utilizing five different thread classes.
- Run the TryMultiThreadSingleClass class retrieve results for a multithreaded run utilizing a single thread class.

Classes
Class: Generator
- This class has method generateRandomSequence, which takes in int length and char[] nucleotide arguments.
- Generates random sequences of characters from passed in array of characters.
- Length of sequence determined by int length passed in.

Class: TrySingleThread
- Runs a single thread from the SingleThread class to generate a hundred random nucleotide sequences ('A', 'T', 'C', 'G') of ten length
- Measure time of run in nanoseconds.

Class: TryMultiThread
- Utilizes five different thread classes: ThreadOne, ThreadTwo, ThreadThree, ThreadFour, and ThreadFive in order to create five respective thread objects to create twenty ten length sequences per thread.
- Measure time of run in nanoseconds.

Class: TryMultiThreadSingleClass
- creates five different thread objects from a single thread class, ThreadOne. Each thread object created from ThreadOne generates 20 different sequences of ten length.
- Measure time of run in nanoseconds.

Class: SingleThread
- This thread class is called by the TrySingleThread class.
- This class contains the code inside run(). The array, char[] nucleotides, contains the nucleotides 'A', 'T', 'G', and 'C' which are to be generated in random sequences of 10 length.
- generateRandomSequences method from Generator class is passed the length and nucleotides arguments.

Class: ThreadOne
- This thread class is called by TryMultiThread and TryMultiThreadSingleClass class to generate the 100 10 length sequences with a five threads from ThreadOne.
- This class contains the code inside run(). The array, char[] nucleotides, contains the nucleotides 'A', 'T', 'G', and 'C' which are to be generated in random sequences of 10 length.
- generateRandomSequences method from Generator class is passed the length and nucleotides arguments.

Classes: ThreadTwo, ThreadThree, ThreadFour, and ThreadFive
- These thread classes are called by TryMultiThread class to generate the 100 10 length sequences with five respective threads.
- This class contains the code inside run(). The array, char[] nucleotides, contains the nucleotides 'A', 'T', 'G', and 'C' which are to be generated in random sequences of 10 length.
- generateRandomSequences method from Generator class is passed the length and nucleotides arguments.

------------------------------

Experiment and Results

Method: TrySingleThread, TryMultiThread, and TryMultiThreadSingleClass are run 10 times each respectively. The results are obtained in nanoseconds. The mean of N=10 results from each of the classes are determined. An Apple M1 Pro processor is used for this experiment. 

Raw Results (nanoseconds):

TrySingleThread: 

343084, 137625, 106042, 606209, 502625, 663625, 98666, 139625, 102292, 101416

TryMultiThread:

859917, 1255709, 633292, 1126125, 875041, 417000, 487000, 1133500, 495375, 497167 

TryMultiThreadSingleClass: 
504167, 1106167, 1051375, 2094750, 1149042, 1105583, 1607833, 997292, 1317416, 1037250

Mean Values (nanoseconds):

TrySingleThread: 280120.9

TryMultiThread: 778012.6

TryMultiThreadSingleClass: 1197087.5

Discussion:

In these results, using a single thread yielded the fastest times at 280120.9 nanoseconds. Utilizing five threads from five different thread classes yielded the second fastest results, at 778012.6 nanoseconds. And utilizing 5 threads from a single thread class yielded the slowest results at 1198097.5 nanoseconds. 

In theory the use of multiple threads to generate the results should have resulted in the fastest speeds. However, in this there are multiple factors that may have contributed to the multithread generations' slower runtime speeds. Contention or competition for shared resources may have contributed to the multithread results being slower than that of the single thread. According to Stackoverflow and ChatGPT, other factors may include: efficient thread syncronization, poor distrubution of work between threads, and overhead from managing threads. 

It is noted that the timer for this experiment starts before the thread assignments and JVM assignments to the CPU. When the timer was set at the beginning of the program for the multithreaded classes, runtimes were up to 7 milliseconds, as opposed to 1-3 milliseconds for the single thread. 

This experiment shows that there is more than meets the eye when it comes to efficiently utilizing multithreading techniques to efficiently run certain programs and operations. 




 






