package Java.task11_20;
import java.io.*;
import java.util.*;

import static java.lang.Math.abs;

public class task19_Java_Subarray {
    private static Scanner in;

    static {
        in = new Scanner(System.in);
    }

    private static int getNegativeSubarrayAmount(int[] array, int arrayLength) {
        int result = 0;
        for(int i = 0; i < arrayLength; i++) {
            if(array[i] < 0) {
                result++;
            }
        }
        if(result == 0) {
            return result;
        }
        result = 0;
        int sum;
        for(int i = 0; i < arrayLength ; i++) {
            sum = 0;
            for(int j = i; j < arrayLength; j++) {
                sum += array[j];
                if(sum < 0) {
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int arrayLength = in.nextInt();
        int[] array = new int[arrayLength];
        for (int i = 0; i<arrayLength; i++) {
            array[i] = in.nextInt();
        }

        System.out.println(getNegativeSubarrayAmount(array, arrayLength));
    }
}
