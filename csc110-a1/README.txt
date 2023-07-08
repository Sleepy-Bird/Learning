Raegan Schofield
CSC110 Assignment 1
2018, Spring Term


Files:
------
Flag.java
ApproxPi.java


Description:
------------
An introductory assignment to Java, Flag.java and ApproxPi.java explore writing, compiling, and running simple java programs. Both files are separate entities, reflecting different assignment specifications. 

1.) Flag.java was to create a java file that would output an ASCII Canadian flag, having it match an example given by the professor.
2.) ApproxPi.java is a program that approximates pi using the first 400 terms, based on the provided series:
    a.) Create a variable called nextTerm and assign it (initially) the value 1.
    b.) Create a variable called denominator and assign it (initially) the value 1.
    c.) Create a variable called series and assign it (initially) the value 0.
    d.) Do the following 400 times:
        i.) Add (nextTerm\denominator) to the series.
        ii.) Add 2 to the denominator.
        iii.) Multiply the nextTerm by -1.
    e.) Multiply the series by 4 then output the result.


How to Run:
-----------
//for Flag.java
$javac Flag.java
$java Flag

//for ApproxPi.java
$javac ApproxPi.java
$java ApproxPi



Goals:
------
-Flag.java highlights the use of System.out.println() and manual formatting. 
-ApproxPi.java explores basic variables and operators, and introduces the use of loops. 
Both programs give practice to java program compiling, running, and debugging.


Credit:
-------
Assignment creation and specifications are credited to Professor LillAnne Jackson, University of Victoria, Spring Term, 2018.
