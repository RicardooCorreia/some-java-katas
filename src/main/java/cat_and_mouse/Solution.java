package cat_and_mouse;

import java.util.Scanner;

public class Solution {

    private static final String CAT_A_WINS = "Cat A";
    private static final String CAT_B_WINS = "Cat B";
    private static final String MOUSE_ESCAPE = "Mouse C";

    /**
     * Returns the closest cat to the mouse or mouse escapes if the two cats are with the same distance
     * @param catA position of cat A
     * @param catB position of cat B
     * @param mouse position of mouse
     * @return 'Cat A' if A wins, 'Cat B' if B wins, 'Mouse C' if mouse escapes
     */
    static String catAndMouse(int catA, int catB, int mouse) {
        int distanceAtoMouse = Math.abs(catA - mouse),
                distanceBtoMouse = Math.abs(catB - mouse);

        if (distanceAtoMouse < distanceBtoMouse) {
            return CAT_A_WINS;
        } else if (distanceAtoMouse > distanceBtoMouse) {
            return CAT_B_WINS;
        } else {
            return MOUSE_ESCAPE;
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] xyz = scanner.nextLine().split(" ");

            int x = Integer.parseInt(xyz[0]);
            int y = Integer.parseInt(xyz[1]);
            int z = Integer.parseInt(xyz[2]);

            String result = catAndMouse(x, y, z);
            System.out.println(result);
        }

        scanner.close();
    }
}
