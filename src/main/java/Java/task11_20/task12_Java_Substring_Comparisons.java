package Java.task11_20;

import java.util.*;

public class task12_Java_Substring_Comparisons {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int k = in.nextInt();
        String firstLine, secondLine;
        firstLine = s.substring(0,k);
        secondLine = s.substring(0,k);

        char a, b;
        for(int i= 1; i<s.length()-k+1; i++) {
            for (int j = 0; j<k; j++) {
                a = s.charAt(j+i);
                b = firstLine.charAt(j);
                if (a < b) {
                    firstLine = s.substring(i,i+k);
                    j=k;
                }
                else if (a > b) j=k;
            }

            for (int j = 0; j<k; j++) {
                a = s.charAt(j+i);
                b = secondLine.charAt(j);
                if (a > b) {
                    secondLine = s.substring(i,i+k);
                    j=k;
                }
                else if (a < b) j=k;
            }
        }

        System.out.println(firstLine);
        System.out.println(secondLine);
    }
}
