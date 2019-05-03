package com.stackroute.pe2;
import java.io.*;
import java.io.File;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileContentReadingAndConvertingToUppercase {

    public static void main(String ar[]) throws IOException {
         Scanner scanner = null;
        try
        {
             scanner=new Scanner(new File("/home/khushbu/Documents/Stackroute/Exercise2/src/java/com/stackroute/pe2/upper.txt"));
        }
        catch(NoSuchElementException e)
        {
         System.out.println("could not find file");
        }


      String line;

        while( scanner.hasNextLine()) {

                    line = scanner.nextLine();
           System.out.println(line.length());
          System.out.println(line.toUpperCase());

        }

    }
}
