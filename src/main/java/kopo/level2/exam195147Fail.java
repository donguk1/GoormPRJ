package kopo.level2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class exam195147Fail {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] x = new int[q][3];
        int[][] y = new int[q][3];

        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 3; j++) {
                x[i][j] = Integer.parseInt(st.nextToken()) - 1;
                y[i][j] = Integer.parseInt(st.nextToken()) - 1;
            }
        }

        for (int i = 0; i < q; i++) {
            int res = 0;

            int xMax = Arrays.stream(x[i])
                    .max()
                    .orElse(0);
            int xMin = Arrays.stream(x[i])
                    .min()
                    .orElse(0);
            int yMax = Arrays.stream(y[i])
                    .max()
                    .orElse(0);
            int yMin = Arrays.stream(y[i])
                    .min()
                    .orElse(0);

            for (int j = yMin; j <= yMax; j++) {
                for (int k = xMin; k <= xMax; k++) {
                    res += a[j][k];
                }
            }
            bw.write(res + "\n");
        }


        bw.flush();
        bw.close();
        br.close();
    }

}
