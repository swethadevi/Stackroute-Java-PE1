/*
        Write a program which accepts an integer number as input from the user and perform the following conditional checks:
        a. Print Tom if number is odd and exists between 20 to 30
        b. Print Jerry, if number is even and exists between 20 and 30
*/

import java.util.*;

public class Question2_Acceptinteger {
    public static void main(String[] args)
    {
        int number;
        //To take input from the user
        Scanner sc = new Scanner(System.in);

        number = sc.nextInt();
        System.out.println("The Given input number is"+number);

        //To check if the given input number is between 20 and 30
        if(number >= 20 && number <= 30)
        {
            if(number % 2 != 0)
            {
                System.out.println("TOM");
            }
            else
            {
                System.out.println("JERRY");
            }
        }
        else
        {
            System.out.println("The number is not in the Range of 20 to 30('-') ");
        }
    }
}