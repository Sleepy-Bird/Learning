Raegan Schofield
June 28, 2023

Files:
------
GradeCalc.java


Description:
------------
A simple grade calculator, using the standard marking components of a UVic CSC course; assignments, labs, midterms, and a final.
The user will be prompted to input the number of each components, the relevant weights, and the marks they got for it.

Note: 
-If the user did not have some of the components for their course, 0 is an acceptable input.
-If, when being requested to enter an int, the user enters a double, the double will be rounded down and turned into an int
-Your course work must add up to a total weight of 100%; if not, program will exit
-The calculator has been standardized to have equal weights within each component.
	example: you have 5 assignments with the total weight being 35%; that means each assignment will have a weight of 7%
-Program is able to quit at anytime by typing 'q' when prompted for user input


How to Run:
-----------
$javac GradeCalc.java
$java GradeCalc


Goals:
------
-To review and brush up on Java
-Get more experience with design, and possible issues that may arise from said designs
-Get more practice with error handling

Credit:
-------
-Two StackOverflow posts that helped me with the validity of user input in function checkInput()
https://stackoverflow.com/questions/12233489/how-to-loop-a-try-catch-statement
https://stackoverflow.com/questions/47852298/how-to-keep-looping-with-try-and-catch-to-get-correct-input

-This project idea was based upon an old CSC110 assignment at UVic by Professor LillAnne Jackson, but I wanted to expand
it to accept user input, handle errors, and be able to adapt if some courses didn't have some components (like labs or a final)