package update_needed.bon_apetit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Solution {

    public static final String BON_APPETIT = "Bon Appetit";

    // Complete the bonAppetit function below.
    static void bonAppetit(List<Integer> itens, int hannahDidNotEat, int charged) {
        itens.remove(hannahDidNotEat);
        int hannahPart = itens.stream().mapToInt(Integer::intValue).sum() / 2;
        System.out.println(hannahPart == charged ? BON_APPETIT : charged - hannahPart);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] nk = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        List<Integer> bill = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int b = Integer.parseInt(bufferedReader.readLine().trim());

        bonAppetit(bill, k, b);

        bufferedReader.close();
    }
}
