package com.company.Controllers;

public class AverageCalculator {


        public static double calculateAverage(int[] numbers) {
            int total = 0;
            for (int num : numbers) {
                total += num;
            }

          //  the division operation should not be performing an integer division whereby the result is truncated.
            //  Casting the total to double helps perforn division to the exact value
            double average = (double) total / numbers.length;
            return average;
        }

        public static void main(String[] args) {
            int[] data = {5, 10, 15, 20, 25};
            double result = calculateAverage(data);
            System.out.println("The average is: " + result);
        }



}
