// https://www.hackerrank.com/challenges/java-if-else/problem?isFullScreen=true
package Java.task01_10;
import java.util.*;


public class task03_Java_If_Else {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if(n%2 != 0) System.out.println("Weird");
        else if (n == 2 || n == 4) System.out.println("Not Weird");
        else if (n>= 6 && n<=20) System.out.println("Weird");
        else System.out.println("Not Weird");
    }
}
