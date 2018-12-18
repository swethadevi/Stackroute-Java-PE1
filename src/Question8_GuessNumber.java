/*
Write a program which accepts a number from user as input (set the limit say 1 - 50 or 1 - 100) User should guess until the the target number is guessed correctly.
Print separate messages for the following:
    a. Number guessed is more than original number
    b. Number guessed is less than original number
    c. Number guessed matches the original number

 */
import java.util.Scanner;

public class Question8_GuessNumber
{
    public static void main(String args[]) {
        //Setting the limit of a number to 101
        int limit = 101;
        Scanner sc = new Scanner(System.in);
        int number;
        do{
            System.out.println("Guess  a Number \n");
            number = sc.nextInt();
            //To check if the number is greater than original number
            if(number>limit)
            {
                System.out.println("Guessed Number is more than Original Number");

            }
            //condition to check if the number is lesser than the original number
            else if(number<limit)
            {
                System.out.println("Guessed Number is leser than than the Original Number");
            }
        }
        //condition to check if the number is same as the original number to stop loop and exit
        while (number != limit);
        System.out.println("Guessed Number matches the Original Number..!!!");
    }
}
