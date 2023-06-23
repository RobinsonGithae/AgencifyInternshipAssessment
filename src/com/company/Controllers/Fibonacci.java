package com.company.Controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
    public static int UserInput;
    public static List<Integer>fiboNumbersArraylist=new ArrayList<>();

   public static void receiveUserInput() throws Exception {
       //create a scanner object
       Scanner scan =new Scanner(System.in);
       UserInput=scan.nextInt();

       if (UserInput<=0){
           throw new Exception("Input must be a positive whole number & greater than 0");
       } else {
           System.out.println("The User input is " + UserInput);
           printFibonacci(UserInput);

       }
   }

  public static void printFibonacci(int UsrInput){
      System.out.println("The Fibonacci sequence up to "+UserInput+" is as below: ");
      //add 0 and 1 to the arraylist since they are the satrting point values
      fiboNumbersArraylist.add(0);
      fiboNumbersArraylist.add(1);
     // System.out.println(fiboNumbersArraylist);

      for (int i = 0; fiboNumbersArraylist.get(i+1)< UsrInput; i++){

     int lastNum=fiboNumbersArraylist.get(i+1);
     int  resultNum=fiboNumbersArraylist.get(i)+fiboNumbersArraylist.get(i+1);

     fiboNumbersArraylist.add(resultNum);


   }


// -1 to get last index and another -1 to get to one index lower just below the value of the value keyed in= which equals -2
  //sublist method helps specify the range to print using an index

     // System.out.println(fiboNumbersArraylist.subList(0,fiboNumbersArraylist.size()-1));

      System.out.println(fiboNumbersArraylist);




   }


    public static void main(String[] args) throws Exception {
	//  PROMPT the user for input
        System.out.println("Enter upper limit for the sequence");

        try {
            receiveUserInput();
        } catch (Exception e){
            //VALIDATION to throw error
            System.out.println("Input must be a number");
        }



    }
}
