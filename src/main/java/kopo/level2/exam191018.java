package kopo.level2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class exam191018 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] s = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[][] res = new int[3][2];

        for (int i = 0; i < n; i++) {
            if (s[i] > res[0][1]) {
                res[2][1] = res[1][1];
                res[1][1] = res[0][1];
                res[0][1] = s[i];

                res[2][0] = res[1][0];
                res[1][0] = res[0][0];
                res[0][0] = i + 1;

            } else if (s[i] > res[1][1]) {
                res[2][1] = res[1][1];
                res[1][1] = s[i];

                res[2][0] = res[1][0];
                res[1][0] = i + 1;
            } else if (s[i] > res[2][1]) {
                res[2][1] = s[i];

                res[2][0] = i + 1;
            }

        }

        bw.write(res[0][0] + " " + res[1][0] + " " + res[2][0] + "\n");
        bw.flush();
        bw.close();
    }
}
