package Java.task21_30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class task21_Java_Arraylist {
    private static List<List<Integer>> arrayList = new ArrayList<>();
    private static void printQueryAnswer(int x, int y) {
        if (arrayList.get(0).get(0) >= x) {
            if (arrayList.get(x).get(0) >= y) {
                System.out.println(arrayList.get(x).get(y));
            } else {
                System.out.println("ERROR!");
            }
        } else {
            System.out.println("ERROR!");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int linesNumber = in.nextInt();
        arrayList.add(Arrays.asList(linesNumber));
        for (int i = 1; i <= linesNumber; i++) {
            int lineSize = in.nextInt();
            List<Integer> oneLine = new ArrayList<>();
            oneLine.add(lineSize);
            for (int j = 1; j <= lineSize; j++) {
                oneLine.add(in.nextInt());
            }
            arrayList.add(oneLine);
        }

        int queryNumber = in.nextInt();
        for (int i = 0; i < queryNumber; i++) {
            int x, y;
            x = in.nextInt();
            y = in.nextInt();
            printQueryAnswer(x, y);
        }
    }
}