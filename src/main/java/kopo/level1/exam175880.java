package kopo.level1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class exam175880 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final int mod = 1_000_000_007;
        int n = Integer.parseInt(br.readLine());
        long res = 1;

        for (int i = 2; i <= n; i++) {
            res = (res * i) % mod;
        }

        bw.write(res + "");
        bw.flush();
        bw.close();

    }


}
