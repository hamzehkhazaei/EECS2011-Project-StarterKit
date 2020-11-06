# EECS2011-Project-StarterKit
This repository provides the starter kit for the project of EECS2011A-F2020: Fundamentals of Data Structures. 

You will create a Java package named eecs2011.project. The [Solution](/src/eecs2011/project/Solution.java) class is where you implement your solutions.

There is an example in the [Sample](/src/eecs2011/project/Sample.java) class showing **one possible way** to read input, store data, and print answers using standard input and output. You are encouraged to implement your input/output/storage methods for better performance.

A sample input is provided by [sample_input](/sample_input).

## Guidelines and Tips
* Please do **NOT** modify the method declarations in the Solution class and the package name. You can add other classes to the package if needed.
* You should read data from standard input and write your answer to standard output. We use similar methods as most online judge systems to check your solutions. We use [pipelines](https://en.wikipedia.org/wiki/Pipeline_(Unix)) to send input to your program and send your output to our judge system. If you can pass the [a plus b problem](https://dmoj.ca/problem/aplusb) on any online judge, you will be fine with the input and the output. Or you can check if your code can get correct input and give output using pipes by the following command.

on Linux/macOS
```
cat sample_input | java yourclass.java
```

on Windows
```
type sample_input | java yourclass.java
```
* Please do **NOT** read and write data (i.e., interim results) from and to the disk. Such operations will be blocked.
* You should strictly follow the sample output format. Implementations that do not follow the correct format will be considered as wrong answers.
* Be sure to give the working solution within the memory and limit (256MB, 10s)

## Deliverables
One zip file with the name ofminiproject.zipincluding 2 files
* Your Java source codes (```src``` folder) zipped in one file: ```source_code_your-student-id.zip```
* A short PDF final report to explain your implementation details: ```final_report.pdf```

Your final report should include the following for each part of the project:
* pseudo code of your solution
* list the name of algorithms and data structures used in your solution
* a short explanation of why you use such algorithms and data structures
* time complexities of your solution in big-O notation
