package hacker_rank.update_needed.birthday_cake;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the birthday function below.
    static int birthday(final List<Integer> squares, int day, int month) {
        int nCombinations = 0;
        // Iterate the array to start in each square
        for (int i = 0; i < squares.size(); i++) {
            int sum = 0;

            // Check if the next iteration will not produce an Array Index Out Of Bounds Exception
            if (i + month <= squares.size()) {

                // Sum all the squares from the start square to (start square + month)
                for (int j = 0; j < month; j++) {
                    sum += squares.get(i + j);
                }
            }

            // check if the sum of the squares is equal to day (target sum)
            if (sum == day)
                nCombinations++;
        }
        return nCombinations;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        String[] dm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(dm[0]);
        int m = Integer.parseInt(dm[1]);
        int result = birthday(s, d, m);
        System.out.println(result);

        bufferedReader.close();
    }
}
