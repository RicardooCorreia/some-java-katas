package hacker_rank.update_needed.apples_and_oranges;

import java.util.Scanner;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int countApples = 0;
        int countOranges = 0;

        for (int apple : apples) {
            if (isHouseRange(s, t, a, apple)) {
                countApples++;
            }
        }

        for (int orange : oranges) {
            if (isHouseRange(s, t, b, orange)) {
                countOranges++;
            }
        }

        System.out.println(countApples);
        System.out.println(countOranges);
    }

    private static boolean isHouseRange(int startHouse, int endHouse, int fruitTree, int fruit) {
        int fruitIndex = fruitTree + fruit;
        return fruitIndex >= startHouse && fruitIndex <= endHouse;
    }

    public static void main(String[] args) {
        String[] st = scanner.nextLine().split(" ");

        int s = Integer.parseInt(st[0]);
        int t = Integer.parseInt(st[1]);
        String[] ab = scanner.nextLine().split(" ");
        int a = Integer.parseInt(ab[0]);
        int b = Integer.parseInt(ab[1]);
        String[] mn = scanner.nextLine().split(" ");
        int m = Integer.parseInt(mn[0]);
        int n = Integer.parseInt(mn[1]);
        int[] apples = new int[m];

        String[] applesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int applesItem = Integer.parseInt(applesItems[i]);
            apples[i] = applesItem;
        }

        int[] oranges = new int[n];

        String[] orangesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int orangesItem = Integer.parseInt(orangesItems[i]);
            oranges[i] = orangesItem;
        }

        countApplesAndOranges(s, t, a, b, apples, oranges);

        scanner.close();
    }
}

