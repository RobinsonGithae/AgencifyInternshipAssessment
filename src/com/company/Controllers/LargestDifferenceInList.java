package com.company.Controllers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/** Author: ROBINSON GITHAE **/

public class LargestDifferenceInList {

    public static int size;
    public static void main(String[] args) {
        System.out.println("WELCOME TO Largest Difference IN A List Calculator\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements you want in the list: ");
        try {
             size = scanner.nextInt();
        } catch (Exception e){
            System.out.println("Number of items in the list MUST BE A NUMBER. Please Rerun the program and renter a number");
            //force java to exit to prevent further execution of code.
            System.exit(0);
        }


        List<Integer> mynumbersArrList = new ArrayList<>();
        System.out.println("You need to Enter Numbers/Elements into the list below:\n");
        System.out.println("Enter the first Element and press Enter");

        try {
            for (int i = 0; i < size; i++) {
                int num = scanner.nextInt();
                System.out.println("Enter Element " + (i + 2) + " and then press Enter");
                mynumbersArrList.add(num);
            }

        } catch (Exception e){
            System.out.println("This List only accepts numbers. Please rerun the program and enter all list items as whole numbers");
            //force java to exit to prevent further execution of code.
          System.exit(0);
        }

        System.out.println("Your List is: "+mynumbersArrList);

        //sort the Arraylist
        List<Integer> sortednumbersArrayLst = new ArrayList<>();
       Collections.sort(mynumbersArrList);

       //computing the largest difference
        //first print the sorted ArrayList
        System.out.println("The sorted List is "+mynumbersArrList);


        //we know that the Collection.sort sorts from smallest to largest so
       int  maxValueInList=mynumbersArrList.get(mynumbersArrList.size()-1);
       int  minValueInList=mynumbersArrList.get(0);
       int  largestDifference=maxValueInList-minValueInList;

       //print the largest difference.
        System.out.println("So ... the Largest Difference in your List is "+ largestDifference);


    }

}
