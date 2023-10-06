package com.hackerrank.java.TagContentExtractor;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * In a tag-based language like XML or HTML, contents are enclosed between a start tag and an end tag like <tag>contents</tag>. Note that the corresponding end tag starts with a /.
 * <p>
 * Given a string of text in a tag-based language, parse this text and retrieve the contents enclosed within sequences of well-organized tags meeting the following criterion:
 * <p>
 * The name of the start and end tags must be same. The HTML code <h1>Hello World</h2> is not valid, because the text starts with an h1 tag and ends with a non-matching h2 tag.
 * <p>
 * Tags can be nested, but content between nested tags is considered not valid. For example, in <h1><a>contents</a>invalid</h1>, contents is valid but invalid is not valid.
 * <p>
 * Tags can consist of any printable characters.
 * <p>
 * Input Format
 * <p>
 * The first line of input contains a single integer,  (the number of lines).
 * The  subsequent lines each contain a line of text.
 * <p>
 * Constraints
 * <p>
 * Each line contains a maximum of  printable characters.
 * The total number of characters in all test cases will not exceed .
 * Output Format
 * <p>
 * For each line, print the content enclosed within valid tags.
 * If a line contains multiple instances of valid content, print out each instance of valid content on a new line; if no valid content is found, print None.
 * <p>
 * Sample Input
 * <p>
 * 4
 * <h1>Nayeem loves counseling</h1>
 * <h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>
 * <Amee>safat codes like a ninja</amee>
 * <SA premium>Imtiaz has a secret crush</SA premium>
 * Sample Output
 * <p>
 * Nayeem loves counseling
 * Sanjay has no watch
 * So wait for a while
 * None
 * Imtiaz has a secret crush
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String TAG_REGEX = "<(.+)>([^<>]+)</\\1>";
        Pattern patter = Pattern.compile(TAG_REGEX);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            boolean none = true;
            String line = in.nextLine();
            Matcher matcher = patter.matcher(line);

            while(matcher.find()){
                System.out.println(matcher.group(2));
                none = false;
            }
            if(none){
                System.out.println("None");
            }
            testCases--;
        }
    }
}
