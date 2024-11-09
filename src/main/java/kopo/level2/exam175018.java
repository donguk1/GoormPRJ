package kopo.level2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class exam175018 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final int mod = 1_000_000_007;
        int n = Integer.parseInt(br.readLine());
        long res = fibonacci(n, mod);

        bw.write(String.valueOf(res));
        bw.flush();
        br.close();
    }

    public static long fibonacci(int n, int mod) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }

        long[] fi = new long[n + 1];
        fi[1] = 1;
        fi[2] = 1;

        for (int i = 3; i <= n; i++) {
            fi[i] = (fi[i - 1] + fi[i - 2]) % mod;
        }

        return fi[n-1];
    }
}
