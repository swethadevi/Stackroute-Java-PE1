package com.stackroute.unittest.pe1;


/*
    Write a program to reverse any string without using String Buffer.
    Input : london
    Output : nodnol
 */

import java.util.*;

public class Question9_ReverseString {

    public static String reverse(String str){

        String Reverse_String = "";


        //To loop through the given input string
        for (int i=str.length()-1; i>=0; i--)
        {
            //Appending the characters to Reverse_String
            Reverse_String += str.charAt(i);
        }

        System.out.println("The Reverse String is \n"+ Reverse_String);
        return Reverse_String;



    }
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.println("Input a string\n");
        String str = sc.next();
        String Reverse_String = " ";
        reverse(str);

    }

}