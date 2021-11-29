package update_needed.drawing_book;

import java.io.*;
import java.util.*;

public class Solution {

    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int nPages, int pageToGo) {
        if (nPages % 2 == 0) nPages++;
        int fromTheBegging = (pageToGo) / 2;
        int fromTheEnd = (nPages - pageToGo) / 2;
        return Math.min(fromTheBegging, fromTheEnd);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");
        System.out.println(n);

        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");
        System.out.println(p);

        int result = pageCount(n, p);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
