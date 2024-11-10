package kopo.level2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class exam175232 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int res = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                bw.write(res++ + "");
                if (j == n-1) {
                    bw.write("\n");
                } else {
                    bw.write(" ");
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
