# Programming Languages Lab 1
CSE 3302 Fall 2017
Lab 1

This lab has three problems. These problems are described below.

For each problem you must perform the following:

1.	Develop both the java Imperative and Functional (Lambda Expression) program solutions. These files should be titled Prob_X_Imperative.java and Prob_X_Functional.java. X stands for the Problem number.
2.	You are to develop and get them running in Eclipse.
a.	Code. 
i.	You need to create each problem as a main program - the code is in the body of the program. You may create a method that does the computations called from the main method - please only one class each for Imperative and Functional solution (a total of 2 classes).
b.	Approach. Both solutions (Imperative and Functional ) need to be recursive. 
i.	Functional approach
1.	For the Functional program you should consider using the UnaryOperator interface in Java to declare its type.
2.	Function definitions will come before the main program (for readability). They will need to be static. 
3.	Since you are using a recursive call on a static function you will need to preface the recursive call with the class name.
4.	The method .apply may be useful to you here also to pass the parameter(s) to the function.
c.	Output.
i.	Execute the data set as described below. Save the data to a file - you can either copy and paste or tell Eclipse how to do this.
ii.	The file names need to be Prob_X_Imperative.txt and Prob_X_Functional.txt
Problem assignment
1.	Problem 1
a.	Implement a function that computes the factorial for the given Integer input.
b.	Print out the first 16 factorial numbers (0 to 15 inclusive). Use a for loop in the main method to do this.
2.	Problem 2
a.	Implement a function that computes the Fibonacci sequence for the given Integer input. 
b.	Print out the first 16 numbers in the Fibonacci numbers (0 to 15 inclusive). Use a for loop in the main method to do this.
3.	Problem 3
a.	Implement a function that computes the Greatest Common Denominator (GCD) for the given two integer inputs.
b.	For this problem print out GCD for the following values for both
for (int i=0; i<10;i++)
	for (int j=0; j<10;j++)
		gcd(i,j);

Submission checklist

1.	All materials should be delivered in a single .zip (not .rar) file. Twelve (12) files total as follows.
2.	Java files - you should have 6 java files - 3 problems with both Functional and Imperative Java files:
a.	Prob_1_Imperative.java
b.	Prob_1_Functional.java 
c.	Prob_2_Imperative.java
d.	Prob_2_Functional.java
e.	Prob_3_Imperative.java
f.	Prob_3_Functional.java
3.	You should have 6 *.txt (output files) - you should copy from the console output in Eclipse and paste this into the correctly named *.txt file as follows.
a.	Prob_1_Imperative.txt
b.	Prob_1_Functional.txt
c.	Prob_2_Imperative.txt
d.	Prob_2_Functional.txt
e.	Prob_3_Imperative.txt
f.	Prob_3_Functional.txt

Uniqueness of solution. Students make work together on a lab assignment, BUT the submittal needs to be distinct from what someone else submits. GTAs will review each submittal - exact appearances in submittals will result in an investigation - this the investigation determines that two submittals are identical both submittals will receive a zero for the entire assignment.
