package kopo.level3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class exam177463 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final int MOD = 100_000_007;

        int n = Integer.parseInt(br.readLine());


        long res = 3;

        while (n-- > 1) {
            res = res * 2 % MOD;
        }

        bw.write(res + "");
        bw.flush();
        bw.close();
        br.close();

    }
}
