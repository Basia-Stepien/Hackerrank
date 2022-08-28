package Java.task01_10;

import java.util.*;

public class task10_Java_Int_to_String {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        String s = String.valueOf(n);
        if (s.equals(String.valueOf(n))) System.out.println("Good job");
    }

}
