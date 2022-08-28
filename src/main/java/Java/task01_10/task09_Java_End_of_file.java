package Java.task01_10;

import java.util.*;

public class task09_Java_End_of_file {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        StringBuilder result = new StringBuilder();

        int i =1;
        do {
            result.append(i).append(" ").append(in.nextLine()).append("\n");
            i++;
        } while(in.hasNext());

        System.out.println(result);
    }

}
