package kopo.level2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Arrays;

public class exam49054 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        BigInteger b = new BigInteger("1");

        for (int i = 1; i <= n; i++) {
            b = b.multiply(BigInteger.valueOf(i));
        }

        String str = String.valueOf(b);

        while (str.length() > 1) {
            int[] s = Arrays.stream(str.split(""))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int a = 0;

            for (int j : s) {
                a += j;
            }

            str = String.valueOf(a);
        }

        bw.write(str);
        bw.flush();
        bw.close();
        br.close();

    }

}
