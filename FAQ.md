# Questions and answers
## Are the input and output coming from one file(the solution file) OR we can arrange it however we want?
You will need to read the input and write your answers using standard IO rather than accessing a file. You should strictly follow the input and output format.

## If we are going to implement a data structure, we have to create/implement them from scratch? ex. are arrays, list etc allowed?
When implementing your solutions, you may NOT use any Java built-in packages EXCEPT java.math, java.io, java.util.Scanner, and java.util.Iterator. All data structure and algorithm implementations should be your own or those taken from previous lectures/assignments/labs.

## Can we add methods to the solution class?
Yes, you can add methods in the solution class if needed. Note that you may not modify the existing method declarations in the solution class.

## Each of my methods opens and closes a Scanner. I found that this not only closes my scanner but closes my System.in input stream as well. Thus, I could not execute the methods back to back. Then, can we include global variables (such as Scanner) in solution.java to prevent this?
For each question and each input, the evaluation process is standalone. So it is fine even you do not close the scanner. You can implement in whatever way you see fit for ease of testing, as long as those four methods in the Solution class you submit can get the correct input when called.

## How will these methods like check_validity(), and schedule_1() be executed? Do we need psvm to call them?
For each question and each input, the judge system will instantiate your Solution class, call the corresponding method, capture your answer from the standard IO stream, and check the answer. Therefore, you don't need a psvm in your solution.

## I was really confused by how can I get to know that how much time and memory is my function taking to get implemented, this might be a stupid question but I dont want to lose marks by not asking it
* Estimate by the data structures and their sizes.
* Use the performance profiler in IDE
* (Linux) Find the PID of your program process, and get the memory usage by the vmpeak attribute in /proc/$pid
* Restrict the Java heap size
* top command (Linux/macOS)
* Task manager (Windows)
