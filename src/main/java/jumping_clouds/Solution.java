package jumping_clouds;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    private static final int MAX_JUMPS = 2;
    private static final int MIN_JUMPS = 1;

    private static final int THUNDERHEADS_REFERECE = 1;

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] clouds) {
        int jumpCount = 0;
        for (int currentPosition = 0; currentPosition < clouds.length; ) {
            if (canTakeJumps(currentPosition, MAX_JUMPS, clouds)) {
                currentPosition = takeJumps(currentPosition, MAX_JUMPS);
                jumpCount++;
            } else if (canTakeJumps(currentPosition, MIN_JUMPS, clouds)) {
                currentPosition = takeJumps(currentPosition, MIN_JUMPS);
                jumpCount++;
            } else {
                // Win!
                break;
            }
        }
        return jumpCount;
    }

    private static int takeJumps(int position, int jumps) {
        return position + jumps;
    }

    private static boolean canTakeJumps(int currentPosition, int jumps, int[] clouds) {
        return !isOffLimits(currentPosition, jumps, clouds) && !isThunderHead(clouds[currentPosition + jumps]);
    }

    private static boolean isOffLimits(int currentPosition, int jumps, int[] clouds) {
        return currentPosition + jumps >= clouds.length;
    }

    private static boolean isThunderHead(int cloud) {
        return cloud == THUNDERHEADS_REFERECE;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);
        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
