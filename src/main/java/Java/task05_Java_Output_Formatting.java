// https://www.hackerrank.com/challenges/java-output-formatting/problem?isFullScreen=true
package Java;

import java.util.*;

public class task05_Java_Output_Formatting {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String[] s = new String[3];
        int[] n = new int[3];
        int sLenght;

        for (int i = 0; i<3; i++) {
            s[i] = in.next();
            n[i] = in.nextInt();
        }

        System.out.print("================================\n");
        for (int i = 0; i<3; i++) {
            System.out.printf("%-14s %03d \n", s[i], n[i]);
        }
        System.out.print("================================");

    }
}
