package hacker_rank.update_needed.breaking_the_records;

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {
        int firstScore = scores[0];
        int maxScore = firstScore, minScore = firstScore;
        int maxBreaks = 0, minBreaks = 0;

        for (int i = 1; i < scores.length; i++) {
            int score = scores[i];
            if (score > maxScore) {
                maxScore = score;
                maxBreaks++;
            } else if (score < minScore){
                minScore = score;
                minBreaks++;
            }
        }
        return new int[]{maxBreaks, minBreaks};
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);
        System.out.println(Arrays.toString(result));

//        for (int i = 0; i < result.length; i++) {
//            bufferedWriter.write(String.valueOf(result[i]));
//
//            if (i != result.length - 1) {
//                bufferedWriter.write(" ");
//            }
//        }
//
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
