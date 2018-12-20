package com.stackroute.unittest.pe1;

/*
     Write a program for the following condition:
    Given 2 inputs , where input1 is string and input 2 is integer value, the last n characters should repeat n number of times in the output String.
    Input1:            Stackroute
    Input2:            5
    Output1:           Stackrouterouterouterouterouteroute
 */


import java.util.*;

public class Question10_InputRepeat {
    public static String repeat(String str, int number)
    {
        String str1 = str.substring(str.length()-number); //to Split the string into substring
        System.out.println(str1);

        String Result_Str = "";
        //to loop the n number of times for the given input number
        for(int i=0;i<number;i++)
        {
            Result_Str  = Result_Str + str1;
        }
        str = str + Result_Str;
        System.out.println(str);
        return str;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Input a string");
        String str = sc.next();

        //To take an input number from the user to repeat split and repeat that many time those letters
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter a number to split and  repeat");
        int number = sc.nextInt();
        repeat(str, number);
    }
}


