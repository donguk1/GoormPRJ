package kopo.level2;

import java.io.*;
import java.util.StringTokenizer;

public class exam175011 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int n = Integer.parseInt(br.readLine());
        int[][] m = new int[n][n];

        int x = 0;
        int y = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {

                m[i][j] = Integer.parseInt(st.nextToken());

                if (m[i][j] == 0) {
                    x = i;
                    y = j;
                }
            }
        }

        int res = 0;

        for (int i = 0; i < n; i++) {
            res += m[x][i];
            res += m[i][y];
        }

        bw.write(String.valueOf(res));
        bw.flush();
        bw.close();
    }
}
