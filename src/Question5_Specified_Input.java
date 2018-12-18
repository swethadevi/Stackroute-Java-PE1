/*
    Write a program that reads an unspecified number of integer arguments using Scanner Class and adds them together. The program should display total of the given input number and should only consider integer value.The program should display an error message if there are any non integer values
    Input :  12 23 2 4
    Output : 41

 */

import java.util.*;

public class Question5_Specified_Input {
    public static void main(String args[]) {

        //calling the find_sum function to find the sum of the given input
        find_sum_specific_number();

    }

    //Method to find the sum of the specific number
    public static void find_sum_specific_number(){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Please input an Integer number \n");
            String str = sc.nextLine();

            int len = str.length();
            int sum=0;

            //System.out.println(str + " " + len);
            for(int i=0;i<len;i++)
            {
                int num=0;
                while(i<len && str.charAt(i)!=' ')
                {
                    num=num*10+(str.charAt(i)-'0');
                    i++;

                }
                sum+=num;


            }
            System.out.println("Sum of the given input number is = " + sum + " ");
        }

        catch (Exception e){
            System.out.println("ERROR..!! Failed to execute the sum of specified number \n ");
        }

    }

}


