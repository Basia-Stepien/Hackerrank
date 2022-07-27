//https://www.hackerrank.com/challenges/java-stdin-stdout/problem?isFullScreen=true
package Java;

import java.util.*;

public class task04_Java_Stdin_and_Stdout_II {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int numberInteger = in.nextInt();
        double numberDouble = in.nextDouble();
        in.nextLine();
        String lineString = in.nextLine();

        System.out.println("String: " + lineString);
        System.out.println("Double: " + numberDouble);
        System.out.println("Int: " + numberInteger);
    }
}
