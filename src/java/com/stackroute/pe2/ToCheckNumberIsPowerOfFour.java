package com.stackroute.pe2;

public class ToCheckNumberIsPowerOfFour {
     public boolean checkingNumberIsPowerOfFour(int number)
     {
        if(!checkForNegativeNumber(number))
            return false;
         int quotient=number;
         int remainder=0;
         while(quotient>=4) {
             quotient = number / 4;
             remainder=number%4;
             number = quotient;
         }
         if(quotient==1&&remainder==0)
             return true;
         else
             return  false;

     }
     public boolean checkForNegativeNumber(int num)

     {
         return num<0;
//         if(num<0)
//          return  true;
//         else
//             return  false;
     }

//    public String checkNullException(int number) {
//        if (false) {
//            if (number == -1)
//                throw new NullPointerException();
//        }
//        return null;
//
//    }
}
