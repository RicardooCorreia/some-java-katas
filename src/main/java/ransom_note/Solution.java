package ransom_note;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        Map<String, Long> words = new HashMap<>();
        Arrays.stream(magazine).forEach(word -> {
            words.putIfAbsent(word, 0L);
            words.put(word, words.get(word) + 1L);
        });
        System.out.println(Arrays.stream(note)
                .allMatch(noteWord -> {
                    if (words.containsKey(noteWord)) {
                        takeWord(noteWord, words);
                        removeIfEntryEmpty(noteWord, words);
                        return true;
                    } else {
                        return false;
                    }
                }) ? "Yes" : "No");
    }

    private static void removeIfEntryEmpty(String noteWord, Map<String, Long> words) {
        if (words.get(noteWord) == 0) {
            words.remove(noteWord);
        }
    }

    private static void takeWord(String noteWord, Map<String, Long> from) {
        from.put(noteWord, from.get(noteWord) - 1);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}
