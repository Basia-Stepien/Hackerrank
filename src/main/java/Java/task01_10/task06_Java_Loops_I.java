// https://www.hackerrank.com/challenges/java-loops/problem
package Java.task01_10;
import java.io.*;

public class task06_Java_Loops_I {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        
        for (int i = 1; i<=10; i++) {
            System.out.println(N + " x " + i + " = " + N*i);
        }
    }
}
