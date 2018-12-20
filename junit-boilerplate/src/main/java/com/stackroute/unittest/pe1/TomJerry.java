package com.stackroute.unittest.pe1;

//to check for tom and jessry success message for ecen nymber

import java.util.Scanner;

public class TomJerry {
    public static void main(String args[]) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num:");
        n = sc.nextInt();

        String result = checktomjerry(n);
        System.out.println(result);


    }

    public static String checktomjerry(int x) {

        int y=x;
        if (x % 2 == 0 && (y >= 20 && y <= 30)) {
            return ("Tom");
        } else if (x % 2 != 0 && (y >= 20 && y <= 30)) {
            return ("Jerry");

        } else {
            return ("Wrong option..!!Better luck next time");

        }
    }
}