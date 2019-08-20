package birthday_cake;

import java.io.*;
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
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        String[] dm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(dm[0]);

        int m = Integer.parseInt(dm[1]);

        int result = birthday(s, d, m);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
