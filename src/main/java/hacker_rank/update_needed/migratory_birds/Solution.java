package hacker_rank.update_needed.migratory_birds;

import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Integer> typeSightings = new TreeMap<>();
        arr.forEach(birdType ->
                typeSightings.compute(birdType, (bird, timesSighted) ->
                        timesSighted = Optional.ofNullable(timesSighted).orElse(0) + 1));

        AtomicInteger winnerBird = new AtomicInteger(-1);
        AtomicInteger timesSighted = new AtomicInteger(-1);
        typeSightings.forEach((bird, times) -> {
            if (times > timesSighted.get() || (times == timesSighted.get() && bird < winnerBird.get())) {
                winnerBird.set(bird);
                timesSighted.set(times);
            }
        });

        return winnerBird.get();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = migratoryBirds(arr);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
