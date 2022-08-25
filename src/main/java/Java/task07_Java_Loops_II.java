//https://www.hackerrank.com/challenges/java-loops/problem
package Java;
import java.util.Scanner;
import static java.lang.Math.pow;


public class task07_Java_Loops_II {
    public static void result(int a, int b, int n) {
        long result = a;

        for (int i=0; i<n; i++) {
            result += pow(2,i) * b;
            System.out.print(result + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();

        for(int i = 1; i<=q; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            result(a,b,n);
        }
    }
}
