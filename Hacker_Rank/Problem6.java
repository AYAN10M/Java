package Hackerrank;
import java.util.*;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }

        sc.close();
    }
}

// Link:
// https://www.hackerrank.com/challenges/java-loops-i/problem?isFullScreen=false
