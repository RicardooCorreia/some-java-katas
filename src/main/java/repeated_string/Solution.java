package repeated_string;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final char letterToFind = 'a';

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long timesToMultiply = n / s.length();
        long countLetter = 0;
        for (char letter : s.toCharArray()) {
            if (letterToFind == letter) {
                countLetter++;
            }
        }
        countLetter *= timesToMultiply;

        long spareLetters = n % s.length();
        for (int i = 0; i < spareLetters; i++) {
            if (letterToFind == s.charAt(i)) {
                countLetter++;
            }
        }
        
        return countLetter;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();


        scanner.close();
    }
}
