package com.hackerrank.java.JavaStringReverse;

import java.util.Scanner;

/**
 * A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.
 *
 * Given a string , print Yes if it is a palindrome, print No otherwise.
 *
 * Constraints
 *
 *  will consist at most  lower case english letters.
 * Sample Input
 *
 * madam
 * Sample Output
 *
 * Yes
 */
public class Solution {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String reverseString = "";
        int stringLength =A.length()-1;

        for(int i=stringLength;i>=0;i--){
            reverseString= reverseString + A.charAt(i);
        }

        if(A.equalsIgnoreCase(reverseString)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
