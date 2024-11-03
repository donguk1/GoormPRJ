package kopo.level2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class exam175177 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int res = n / 40 +
                n % 40 / 20 +
                n % 20 / 10 +
                n % 10 / 5 +
                n % 5;

        bw.write(String.valueOf(res));

        bw.flush();
        bw.close();
        br.close();

    }
}
