package Java;

import java.util.*;

public class task08_Java_Datatypes {
    public static String types(String number) {
        String result = number;
        Long n = null;
        if (number.length() >20) result += " can't be fitted anywhere.";
        else if (number.length() == 20) {
            int firstTwo = Integer.parseInt(number.substring(0, 2));
            long restDigits = Long.parseLong(number.substring(2));
            if ((firstTwo == -9) && (restDigits > 223372036854775808L)
                    || (firstTwo > 9) || ((firstTwo == 9) && (restDigits > 223372036854775807L))) {
                result += " can't be fitted anywhere.";
            } else n = Long.parseLong(number);
        }
        else if (number.length() == 19) {
            String first = number.substring(0, 1);
            long restDigits = Long.parseLong(number.substring(1));
            if ((first.equals("9")) && (restDigits > 223372036854775807L)) {
                result += " can't be fitted anywhere.";
            } else n = Long.parseLong(number);
        }
        else {
            n = Long.parseLong(number);
        }

        if (!(n == null)) {
            result += " can be fitted in:";
            if (n <= 127 && n >= -128) result += "\n* byte";
            if (n <= 32767 && n >= -32768) result += "\n* short";
            if (n <= 2147483647 && n >= -2147483648) result += "\n* int";
            result += "\n* long";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        StringBuilder result = new StringBuilder();
        for (int i = 1; i<=t; i++) {
            String number = in.next();
            result.append(types(number)).append("\n");
        }
        System.out.println(result);
    }
}
