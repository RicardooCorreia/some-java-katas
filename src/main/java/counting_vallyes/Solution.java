package counting_vallyes;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution {
    private static final String UP = "U";
    private static final String DOWN = "D";

    private static final Map<String, Integer> LEVEL_MAPPING =
            new HashMap<String, Integer>() {{
                put("U", 1);
                put("D", -1);
            }};


    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        AtomicBoolean inValley = new AtomicBoolean(false);
        AtomicInteger currentLevel = new AtomicInteger(0);

        String[] valleys = s.split("");

        return Arrays.stream(valleys)
                .map(LEVEL_MAPPING::get)
                .reduce(0, (valleyCount, movement) -> {
                    currentLevel.set(currentLevel.get() + movement);
                    if (currentLevel.get() == 0 && inValley.get()) {
                        inValley.set(false);
                        return valleyCount + 1;
                    } else if (currentLevel.get() < 0 && !inValley.get()) {
                        inValley.set(true);
                    }
                    return valleyCount;
                });
    }

    private static boolean exitingAValley(int currentLevel, boolean inValley) {
        return inValley && currentLevel == 0;
    }

    private static boolean enteredAValley(int currentLevel, boolean inValley) {
        return !inValley && currentLevel < 0;
    }

    private static Integer getLevelIncrement(String valley) {
        return LEVEL_MAPPING.get(valley);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        System.out.println(result);
        scanner.close();
    }
}
