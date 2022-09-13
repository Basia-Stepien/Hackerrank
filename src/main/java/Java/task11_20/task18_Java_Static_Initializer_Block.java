package Java.task11_20;
import java.util.*;

public class task18_Java_Static_Initializer_Block {
    private static final String error;
    private static final Scanner in;

    static {
        error = "java.lang.Exception: Breadth and height must be positive";
        in = new Scanner(System.in);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int breadth = in.nextInt();
        int height = in.nextInt();
        if (breadth > 0 && height > 0) {
            System.out.println(breadth * height);
        } else {
            System.out.println(error);
        }
    }
}
