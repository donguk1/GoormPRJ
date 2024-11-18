package kopo.level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class exam194193 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] n = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        float a = (float) (n[0] + n[1]) / n[0];

        double result = Math.floor((7.0 / a) * 100) / 100;

        System.out.printf("%.2f", result);

    }
}
