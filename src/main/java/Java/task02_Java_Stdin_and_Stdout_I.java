//https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem?isFullScreen=true
package Java;
import java.util.*;

public class task02_Java_Stdin_and_Stdout_I {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        System.out.println(a + "\n" + b + "\n" + c);
    }
}
