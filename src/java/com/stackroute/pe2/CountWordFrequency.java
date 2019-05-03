package com.stackroute.pe2;

public class CountWordFrequency {
    int count = 0, j;
    String str = "hi how are you you are genious are you";//string provided
    String arr[] = str.split(" ");

    public int CountWords(int i) {
        if (i < arr.length) {
            String str1 = arr[i];
            for (j = 0; j < arr.length; j++) {
                if (arr[j].equals(str1)) {//comparing the word from each word of the string
                    count++;

                }

            }
            System.out.println(count);
            return count;

        } else
            return -1;
    }
}


