package com.stackroute.pe2;

public class CallingMembersClass {
       public static void main(String ar[]) {
           MemberVariablesAndMethods object = new MemberVariablesAndMethods();
           object.setName("khushbu");
           System.out.println(object.getName());
           object.setAge(22);
           System.out.println(object.getAge());
           object.setSalary(50000);
           System.out.println(object.getSalary());

       }
}
