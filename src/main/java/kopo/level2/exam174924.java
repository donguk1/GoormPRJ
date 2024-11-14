package kopo.level2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class exam174924 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] res = new int[n];

        int[] s = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        res[0] += s[0];

        int a = 0;

        for (int i = 1; i < n; i++) {
            if (s[i]-1 == s[i-1]) {
                res[a] += s[i];
            } else {
                a++;
                res[a] += s[i];
            }
        }

        bw.write(Math.max(Arrays.stream(res).max().getAsInt(), Arrays.stream(s).max().getAsInt()) + "");
        bw.flush();
        bw.close();
        br.close();

    }
}
