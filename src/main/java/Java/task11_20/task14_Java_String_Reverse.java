package Java.task11_20;

import java.util.*;

public class task14_Java_String_Reverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int ALength = A.length();
        for(int i = 0; i<ALength; i++) {
            char sign1 = A.charAt(i);
            char sign2 = A.charAt(ALength-1-i);
            if (sign1 != sign2) {
                System.out.println("No");
                break;
            }
            if((ALength-1-i == i) || (ALength-i == i)) {
                System.out.println("Yes");
            }
        }
    }
}
