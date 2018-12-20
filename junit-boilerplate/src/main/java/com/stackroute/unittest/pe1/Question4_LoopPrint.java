package com.stackroute.unittest.pe1;


/*/*
    Write a program using a loop to print the following output. 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6       6 6 . . . nth iteration.
    Input: 5
    Output : 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5
 */
import java.util.*;

public class Question4_LoopPrint {
    public static void main(String args[]) {

        System.out.println(check_loopPrint(10));
    }

        public static String check_loopPrint(int num){
        StringBuilder result = new StringBuilder();
            int i,j;
            //Scanner sc = new Scanner(System.in);
            //System.out.println("Enter a number:\n");
            //num = sc.nextInt();
            //To loop through the given input
            for(i=1; i<=num; i++)
            {
                j = i;
                while(j != 0)
                {
                    //System.out.println(i+" ");
                    result.append(i+" ");
                    j--;
                }
            }
            return result.toString();
          }

}


