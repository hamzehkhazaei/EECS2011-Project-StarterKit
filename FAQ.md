# Frequently Asked Questions

## How should I zip my deliverables?
You should submit one zip file with the name of mini_project.zip including a folder named mini_project. There should be 2 files in the mini_project folder. The directory structure in project.zip should look like this:

```
mini_project.zip
│   source_code_your-student-id.zip
│   final_report.pdf
```

## How should I zip my source code?
Zip your src directory (**include** the src folder). The directory structure in your source code zip file should look like this:

```
src
└───eecs2011
    └───project
        │   Solution.java
        │   foo.java
        │   ...
```

## Are the input and output coming from one file(the solution file) OR we can arrange it however we want?
You will need to read the input and write your answers using standard IO rather than accessing a file. You should strictly follow the input and output format.

## If we are going to implement a data structure, we have to create/implement them from scratch? ex. are arrays, list etc allowed?
When implementing your solutions, you may NOT use any Java built-in packages EXCEPT java.math, java.io, java.util.Scanner, and java.util.Iterator. All data structure and algorithm implementations should be your own or those taken from previous lectures/assignments/labs.

## Grading critera regarding performance
The grading criteria in terms of performance is not just based on the overall time complexity. We mainly focus on how you store/process the graph. The time complexity for reading the input does not matter that much. If you can achieve better time/space complexities for the graph storage and processing, please mention and explain them correctly in the report. Your solution will be considered to have better performance, and it will be reflected in the grade.

## Can we add methods to the solution class?
Yes, you can add methods in the solution class if needed. Note that you may not modify the existing method declarations in the solution class.

## Each of my methods opens and closes a Scanner. I found that this not only closes my scanner but closes my System.in input stream as well. Thus, I could not execute the methods back to back. Then, can we include global variables (such as Scanner) in solution.java to prevent this?
For each question and each input, the evaluation process is standalone. So it is fine even you do not close the scanner. You can implement in whatever way you see fit for ease of testing, as long as those four methods in the Solution class you submit can get the correct input when called.

## How will these methods like check_validity(), and schedule_1() be executed? Do we need psvm to call them?
For each question and each input, the judge system will instantiate your Solution class, call the corresponding method, compile and execute the code, capture your answer from the standard IO stream, and check the answer. Therefore, you don't need a psvm in your solution.

## I was really confused by how can I get to know that how much time and memory is my function taking to get implemented, this might be a stupid question but I dont want to lose marks by not asking it
* Estimate by the data structures and their sizes.
* Use the performance profiler in IDE
* (Linux) Find the PID of your program process, and get the memory usage by the vmpeak attribute in /proc/$pid/status
* Restrict the Java heap size
* (Linux/macOS) top command
* (Windows) Task manager

## I just want to ask that the constraint which says that the execution time for each part should be less than 10 seconds does that mean the value of the last outpur in part 2 and in all the part should be less than 10 seconds.
The limit (10s, 256MB) is imposed on your program. Your code will be interrupted and marked as 0 if it goes beyond the limit. The 10s limit has nothing to do with the total execution time of the application workflow.

## Please explain the memory limit for the project.
Please note that this 256MB limit is for the amount of memory (i.e., RAM) that your program uses when being executed. It doesn't have anything to do with the size of your source code.

## There are a few functions within my Graph class that throw exceptions. Am I allowed to add a throws clause to the method signature in the Solution class?
You can add throws clauses to the method declaration in the Solution class. Please note that exception handling may impact the performance of your program if not implemented properly.

## I want to ask if we found for example 3 different variations that have the same shortest time solution, is it enough for us just give one of them as a solution for p2.
As mentioned in the sample output of Part 2, there might be multiple valid execution orders for functions. You just need to give one of them, and the judge system will check the correctness of your answer.

## So if a function does not have an edge to the end node, but that function can reach the end node from an indirect way(meaning there is a path to the end node), in that case, is the graph that contains this function would be disconnected? Can we say that?
Please read the second condition in the Part 1 description. When there is a path from f_x to f_y, it means f_y is reachable from f_x. Does this scenario satisfy the two conditions? If it does, then it is valid.

## Can we get the output for part 2 and part 3 as well for valid_100 which was given to us.
There might be numerous correct answers when n equals 100. It is very likely that your correct output does not match the sample output we give. Therefore, to be less confusing, we don't give the sample output for valid_100 for parts 2 and 3.

## I understand there might be multiple outputs for part2-4 for multiple functions order, but there is only one total finish time for each part right? Cause we need to make the time as short as possible, so is it that only the shortest time will be counted as only correct answer, or it's okay for us to try to minimize the time but may not be the shortest?
For part 2 and part 3, the total execution time in your answer has to be the minimum possible value; otherwise, it will be marked as an incorrect answer.

For part 4, your solution does not need to give the minimum possible value in terms of the total execution time. We accept the answer that is not the shortest. But of course, shorter is better.
Please note that your solution for part 4 has to make use of two machines when possible. That's to say, if you only use one machine, like part 2, no grade will be given.

## And for part3, to make sure I am on the correct track, could one more example output's total execution time be given to us? Like the 100 valid input's total time is enough.
For part 3, the last line of the sample output for valid_100 is 1323.

## For part 3, the way I understood it is that we see how long it takes for each function to execute and then the final line is how long it takes for the longest function to execute until the end. Am I understanding how to calculate the final line correctly?

According to the project description, the two space-separated integers in the output represent the name of the function and the time point when its execution begins.

Take the sample output in Part 3 as an example. The first n lines mean:
at t=0, the execution of f1 begins on the cluster;
at t=295, the execution of f2 begins on the cluster;
at t=124, the execution of f3 and f4 begins on the cluster;
where t is the time since the cluster starts to execute the application.

The last line of the output is the total execution time of the application. In other words, it is the time point when the execution of the last function in the application is completed on the cluster. In the Part 3 sample output, f2 was the last function completed, whose execution began at t=295 and ended at t=444. Therefore, the total execution time of the application is 444 ms. 
