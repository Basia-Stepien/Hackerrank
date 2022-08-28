package Java;

import java.util.*;

public class task11_Java_Strings_Introduction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int aAndBLength = A.length()+B.length();
        System.out.println(aAndBLength);

        if (A.compareTo(B) > 0) System.out.println("Yes");
        else System.out.println("No");

        String C = A.replace(A.charAt(0), (char) (A.charAt(0)-32)) + " " + B.replace(B.charAt(0), (char) (B.charAt(0)-32));
        System.out.println(C);
    }
}
