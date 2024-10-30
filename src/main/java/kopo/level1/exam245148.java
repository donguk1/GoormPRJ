package kopo.level1;

import java.io.*;

public class exam245148 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String[] ab = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i%2 != 0) {
                    bw.write(ab[1] + " ");
                } else {
                    bw.write(ab[j%2] + " ");
                }

            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
