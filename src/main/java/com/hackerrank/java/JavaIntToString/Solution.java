package com.hackerrank.java.JavaIntToString;

import java.util.Scanner;

/**
 * You are given an integer , you have to convert it into a string.
 *
 * Please complete the partially completed code in the editor. If your code successfully converts  into a string  the code will print "Good job". Otherwise it will print "Wrong answer".
 *
 *  can range between  to  inclusive.
 *
 * Sample Input 0
 *
 * 100
 * Sample Output 0
 *
 * Good job
 */
public class Solution {
    public static void main(String[] args) {

        DoNotTerminate.forbidExit();

        try {
            Scanner in = new Scanner(System.in);
            int n = in .nextInt();
            in.close();
            String s = String.valueOf(n);//Solution is here on this line


            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        } catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}
