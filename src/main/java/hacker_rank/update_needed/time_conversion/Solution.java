package hacker_rank.update_needed.time_conversion;

import java.io.*;
import java.util.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        boolean isPM = s.substring(8).equals("PM");
        String hours = s.substring(0, 8);

        if (isPM && !hours.substring(0, 2).equals("12")) {
            String newHours = String.valueOf(Integer.parseInt(hours.substring(0, 2)) + 12);

            hours = newHours + s.substring(2, 8);
        }

        if (hours.substring(0, 2).equals("12") && !isPM) {
            hours = "00" + hours.substring(2);
        }

        return hours;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String s = scan.nextLine();

        String result = timeConversion(s);

        System.out.println(result);
    }
}
