# AgencifyInternshipAssessment
Agencify Test Assessment
This is a software engineering assessment test in core Java.


## FIBONACCI PROBLEM

### Fibonacci
The fibonacci solution adds the previous two numbers in an array to give a sequence e.g 0,1,1,2,3,5

### Solution
In this solution A user:
Enters the value up to which the fibonacci sequence should reach. The java program then calculates the sequence and displaces the sequence as a list

### Implementation
This java code does not have a UI. The java code takes in the upper limit as input from the user using the Java Scanner class. The upper limit determines when the sequence should stop calculating.
An arraylist is used to store the results of the addition of the previous two numbers at each step.The arraylist items are then printed when the Sequence is complete.

### Geting userinput and Validation
The input is validated in a try and catch block whereby it throws an error if non-numbers are entred.

### Modularlization 
An MVC architecture has been used to separate the various java classes in addtion to the separated functions receiveUserInput and printFibonacci.



## FINDING THE AVERAGE IN AN ARRAY
This task calculates the average of number elements in an array. 

### Solution
I identified the bug in this code to being the "Inaccuracy in division" which results to truncated results. Dividing the total as an Integer type reduces the accuracy of the result incase it yields decimal point results e.g 15.2345 is truncated to 15. I therefore corrected the code by casting the total value to double before performing the division operation is undertaken.  

### Implementation
The java code uses a for loop to calculate the sum of the array elements. The double keyword is cast on the total to fix accuracy problem. The total is then divided by the number of items in the array to give an average.



## LARGEST DIFFERENCE IN A LIST
Finding the largest difference in a keyed in List of numbers e.g in [10,1,15] should return 14

### Solution
In this task, the program prompts the user to specify the number of items to be contained in a list of numbers. The user then keys in the numbers one after the other depending on number of items specified. The program then prints the list of numbers entrered, sorts the List and then finds the difference between the smallest and Largest element in the list.

### Implementation
A scanner java class is used to enter numeric values. The values are captured inside a try and catch block whereby execution stops incase of bad input by the user. ArrayList is used to store the values and then the List is sorted using "Collection.sort". The index of the first and last value are used to calculate the difference between the smallest and Largest value of the sorted List.  


