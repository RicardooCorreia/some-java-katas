package hacker_rank.update_needed.mark_cakewalk;

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the marcsCakewalk function below.
    static long marcsCakewalk(int[] calorie) {
        long totalWalk = 0L;
        Arrays.sort(calorie);
        for (int i = calorie.length - 1; i >= 0; i--) {
            totalWalk += calcWalkForCupcake(calorie[i], (calorie.length - 1) - i);
        }
        return totalWalk;
    }

    private static long calcWalkForCupcake(int calorie, int orderEaten) {
        return (long) (Math.pow(2, orderEaten) * calorie);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] calorie = new int[n];

        String[] calorieItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int calorieItem = Integer.parseInt(calorieItems[i]);
            calorie[i] = calorieItem;
        }

        long result = marcsCakewalk(calorie);
        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
