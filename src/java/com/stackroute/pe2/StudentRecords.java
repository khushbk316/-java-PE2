package com.stackroute.pe2;

/*
        Write a program, which reads number of students and n grades as input (of int
between 0 and 100, inclusive) and displays the average, minimum and maximum.Your
program shall check for valid input. You should keep all the grades in an int[] and use a
method for each of the computations.

*/

import java.util.Arrays;
import java.util.Scanner;

public class StudentRecords {
    public static void main(String ar[]) {
        System.out.println("enter no of terms");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int[] arr =new int[num];
        int i;

        for (i = 0; i < num; i++) {
            System.out.println("enter values");
            arr[i] = s.nextInt();

        }
        int max = getMax(arr);
        System.out.println("Maximum Value is: "+max);

        // Calling getMin() method for getting min value
        int min = getMin(arr);
        System.out.println("Minimum Value is: "+min);

        float avg=getAvg(arr);
        System.out.println(("average value is"+avg));
    }

    // Method for getting the maximum value
    public static int getMax(int[] inputArray){

            Arrays.sort(inputArray);
            int length=inputArray.length;
            int maxValue=inputArray[length-1];

        return maxValue;
    }

    // Method for getting the minimum value
    public static int getMin(int[] inputArray){
        Arrays.sort(inputArray);
        int minValue=inputArray[0];

        return minValue;
    }

    public static float getAvg(int[] inputArray){
        int sum=0;
        float avg=0;
        for(int i=1;i<inputArray.length;i++){
            sum=sum+inputArray[i];
            avg=sum/inputArray.length;
            }
        return avg;
        }





}

