package hacker_rank.update_needed.rouding_grades;

import java.io.*;
import java.util.*;

public class Solution {

    private static int numbersToFive(int number) {
        return 5 - (number % 5);
    }

    private static boolean shouldRound(int grade) {
        return grade >= 38 && numbersToFive(grade) < 3;
    }

    private static int round(int grade) {
        return grade + numbersToFive(grade);
    }

    /*
     * Complete the gradingStudents function below.
     */
    static int[] gradingStudents(int[] grades) {
        return Arrays.stream(grades)
                .map(grade -> {
                    if (shouldRound(grade)) {
                        return round(grade);
                    }
                    return grade;
                })
                .toArray();
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] grades = new int[n];

        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            grades[gradesItr] = gradesItem;
        }

        int[] result = gradingStudents(grades);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bw.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bw.write("\n");
            }
        }

        bw.newLine();

        bw.close();
    }
}

