package com.stackroute.pe2;

public class revAndCheckPalindrome {
    String str1;
    int flag=0;
    public  String checkPalindrome(String str) {
        str1 = new StringBuffer(str).reverse().toString();

        System.out.println(str1);

            if(str.equals(str1))
            flag=0;
            else if(!str.equals(str1))
                flag=1;

       if(flag==0)
           return "true";
       else
           return "false";

    }

    public String checkNullException(String strnull) {
        if (false) {
            if (strnull == null)
                throw new NullPointerException();
        }
        return null;
    }
}
