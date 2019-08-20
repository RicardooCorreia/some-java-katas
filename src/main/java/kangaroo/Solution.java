package kangaroo;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    private static final String YES = "YES";
    private static final String NO = "NO";


    // Complete the kangaroo function below.
    static String kangaroo(int k1StartPosition, int k1JumpSize, int k2StartPosition, int k2JumpSize) {
        // Kangaroo 2 always start ahead of 1, so if the the jump size of the kangaroo 2 is bigger than the kangaroo 1
        // then kangaroo 1 never going to catch him.

        if (k1JumpSize <= k2JumpSize) {
            return NO;
        }

        int jumpIndex = 0;
        int k1CurrentPosition = k1StartPosition;
        int k2CurrentPosition = k2StartPosition;
        while (k1CurrentPosition < k2CurrentPosition) {
            k1CurrentPosition += k1JumpSize;
            k2CurrentPosition += k2JumpSize;
        }
        return k1CurrentPosition == k2CurrentPosition ? YES : NO;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] x1V1X2V2 = scanner.nextLine().split(" ");

        int x1 = Integer.parseInt(x1V1X2V2[0]);

        int v1 = Integer.parseInt(x1V1X2V2[1]);

        int x2 = Integer.parseInt(x1V1X2V2[2]);

        int v2 = Integer.parseInt(x1V1X2V2[3]);

        String result = kangaroo(x1, v1, x2, v2);

        System.out.println(result);

        scanner.close();
    }
}
