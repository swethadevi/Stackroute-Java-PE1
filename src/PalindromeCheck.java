
//Java program for Palindrome Number.

import java.util.*;

public class PalindromeCheck
{
    public static void main(String args[]){
        int num,temp,sum;

        Scanner sc=new Scanner(System.in);

        //input an integer number
        System.out.print("Enter any integer number To Check if it is Palindrome or not: ");
        num= sc.nextInt();

        //find the reverse number
        temp=num;
        sum =0;
        while(temp>0)
        {
            sum = (sum*10) + (temp%10);
            temp/=10;
        }

        //check Given number  with reversed number
        if(num==sum)
            System.out.println(num + " is a Palindrome Number.");
        else
            System.out.println(num + " is not a Palindrome Number.");
    }
}