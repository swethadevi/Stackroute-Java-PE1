package com.stackroute.unittest.pe1;

/*
    Create a program that accepts a word as input and checks for each single character letter in the word whether it is a consonant or vowel.Condition:
    a. Print an error message if the input is not a letter
    b. If the input having more than one letter, print the required output
          (Vowel or Consonant) for each letter
 */

import java.awt.peer.SystemTrayPeer;
import java.util.*;

public class Question3_VowelConsonants {
    public static void main(String args[]) {

        System.out.println(Check_VowelConsonant("Boeing"));
        System.out.println(Check_VowelConsonant("stackroute"));

    }

    public static String Check_VowelConsonant(String word){

        StringBuilder result = new StringBuilder();

        //Scanner sc = new Scanner(System.in);
        //System.out.println("Please Input a String");
        //String word = sc.next();
        if (!word.matches("[a-zA-Z]+"))
        {
            //System.out.println("(-_-) ERROR,!Please input letters");

        }
        else
        {
            //To loop through the sequence of word
            for (int i = 0; i < word.length(); i++)
            {
                //To check if the given Word is having Vowel or Consonant
                if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u')
                {
                    result.append(word.charAt(i) + "VOWEL ");
                    //System.out.println(word.charAt(i) + "VOWEL");
                }
                else
                {
                    result.append(word.charAt(i) + "CONSONANT ");
                    //System.out.println(word.charAt(i) + "CONSONANT");
                }
            }
        }
        return result.toString();
    }

}