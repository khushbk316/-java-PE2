package com.stackroute.pe2;

import java.util.Scanner;

public class Factorial {
     public static void main(String ar[])
     {
         long factorial=1;
         long MAX_VALUE=Long.MAX_VALUE;
         System.out.println(MAX_VALUE);

         System.out.println("enter the number");
         Scanner scanner=new Scanner(System.in);
         long number=scanner.nextLong();
         factorial=factorial(number);
             if( factorial>0)
        System.out.println(factorial);
             else
                 System.out.println("factorial of "+number+"is out of range");

     }

     public  static long factorial(long num)
     {
         if (num == 0)
             return 1;

         return num*factorial(num-1);
     }


}
