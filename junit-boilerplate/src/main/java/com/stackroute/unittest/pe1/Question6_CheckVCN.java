package com.stackroute.unittest.pe1;

/*
    Write a program that takes a character from the user as input and determines whether the character entered is a capital letter, a small case letter, a digit or a special symbol and display appropriately.
    Input:  A
    Output:  Capital letter
 */

import java.util.Scanner;

public class Question6_CheckVCN {
    public static void main(String args[]) {

        System.out.println(check_CheckVCN("S"));
        System.out.println(check_CheckVCN("w"));
        System.out.println(check_CheckVCN("e"));

    }

        public static String check_CheckVCN(String str){

            StringBuilder result = new StringBuilder();

            //Scanner sc = new Scanner(System.in);
            //System.out.println("Please input a Character of ur Choice");
            //String str = sc.next();

            if(str.length() == 1)
            {
                if(str.matches("[A-Z]"))
                {
                    result.append("Capital Letter");
                    //System.out.println("Capital Letter");
                }
                else if(str.matches("[a-z]"))
                {
                    result.append("Small Letter");
                    //System.out.println("Small Letter");
                }
                else if(str.matches("[0-9]"))
                {
                    result.append("Digit");
                    //System.out.println("Digit");
                }
                else
                {
                    result.append("Special Character");
                    //System.out.println("Special Character");
                }
            }
            else
            {
                result.append("The Length of the Character is greater than 1");
                //System.out.println("The Length of the Character is greater than 1");
            }
            return result.toString();
        }
}
