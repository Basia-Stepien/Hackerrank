package Java.task11_20;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class task15_Java_Date_and_Time {

    public static String findDay(int month, int day, int year) {
        LocalDate localDate = LocalDate.of(year, month, day);

        return String.valueOf(localDate.getDayOfWeek());
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int month = in.nextInt();
        int day = in.nextInt();
        int year = in.nextInt();

        System.out.println(findDay(month, day, year));

    }
}
