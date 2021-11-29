package hacker_rank.update_needed.sock_merchant;

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] socks) {
        List<Integer> freeSocks = new ArrayList<>(n);
        int pairsCount = 0;

        for(int i = 0; i < n; i++) {
            int nextSock = socks[i];
            if (freeSocks.contains(nextSock)) {
                pairsCount++;
                freeSocks.remove(new Integer(nextSock));
            } else {
                freeSocks.add(nextSock);
            }
        }

        return pairsCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);
        System.out.println(result);

        scanner.close();
    }
}

