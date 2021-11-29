package update_needed.alternating_characters;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    static int alternatingCharacters(String s) {
        AtomicInteger deletions = new AtomicInteger(0);
        s.chars().reduce((previousChar, newChar) -> {
            if (newChar == previousChar) {
                deletions.incrementAndGet();
            }
            return newChar;
        });
        return deletions.get();
    }

    public static void main(String[] args) throws IOException {
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();
            int result = alternatingCharacters(s);
            System.out.println(result);
        }

        scanner.close();
    }
}
