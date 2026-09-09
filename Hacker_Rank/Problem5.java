package Hackerrank;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");
        sc.close();
    }
}

// https://www.hackerrank.com/challenges/java-output-formatting/problem?isFullScreen=false

/*
 Things learn:
 
 The System.out.printf function relies on format specifiers to dynamically handle alignment and padding without manual string concatenation. The specifier %-15s left-justifies a string inside a fixed 15-character column,automatically calculating and appending the exact number of trailing spaces needed regardless of input length. To format integers, %03d forces the value into a 3-digit representation by dynamically inserting leading zeros for numbers under 100. Ending the format string with %n ensures a clean, platform-independent newline across different operating systems.
 */