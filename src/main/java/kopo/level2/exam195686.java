package kopo.level2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class exam195686 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()) - 1;

        int[] k = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean up = true;
        boolean down = true;

        for (int i = 1; i < k.length; i++) {
            if (k[i] >= k[i - 1] && up) {

            } else if (k[i] <= k[i - 1] && down) {
                up = false;
            } else if (k[i] > k[i - 1]) {
                down = false;
            }
        }

        if (down) {
            bw.write(Arrays.stream(k).sum() + "");

        } else {
            bw.write("0");
        }


        bw.flush();
        bw.close();
        br.close();
    }
}
