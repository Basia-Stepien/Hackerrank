package Java.task11_20;

import java.util.Arrays;
import java.util.Scanner;

public class task16_Java_Anagrams {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length() != b.length()) {
            return false;
        }
        String c = a.toLowerCase();
        String d = b.toLowerCase();
        char[] arrayA = new char[a.length()], arrayB = new char[b.length()];
        for (int i = 0; i<a.length(); i++) {
            arrayA[i] = c.charAt(i);
            arrayB[i] = d.charAt(i);
        }
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        for(int i = 0; i<a.length(); i++) {
            if(arrayA[i] != arrayB[i]) {
                return false;
            }
        }
            return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
