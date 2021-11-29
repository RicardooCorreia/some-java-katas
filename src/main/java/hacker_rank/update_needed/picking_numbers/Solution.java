package hacker_rank.update_needed.picking_numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    public static int pickingNumbers(List<Integer> a) {
        Collections.sort(a);
        int maxCount = 0;
        for (int i = 0; i < a.size(); i++) {
            int firstNumber = a.get(i);
            int lastPositionOfFirstNumber = i;
            int currentCount = 1;
            for (int j = i + 1; j < a.size(); j++) {
                int nextNumber = a.get(j);
                if (nextNumber == firstNumber) {
                    lastPositionOfFirstNumber = j;
                    currentCount++;
                } else if (nextNumber == firstNumber + 1) {
                    currentCount++;
                } else {
                    break;
                }
            }
            if (currentCount > maxCount) {
                maxCount = currentCount;
            }
            i = lastPositionOfFirstNumber;
        }
        return maxCount;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.pickingNumbers(a);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
