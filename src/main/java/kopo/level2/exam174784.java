package kopo.level2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class exam174784 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        double[][] d = new double[n+1][3];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            double w = Integer.parseInt(st.nextToken());
            double u = Integer.parseInt(st.nextToken());

            d[i][0] = w / u;    // 밀도
            d[i][1] = w;        // 무게
            d[i][2] = i;        // 번호
        }

        for (int i = 0; i < n; i++) {

            if (d[i][0] > d[n][0]) { // 1순위 밀도 비교
                d[n][0] = d[i][0];
                d[n][1] = d[i][1];
                d[n][2] = i;

            } else if (d[i][0] == d[n][0]) { // 밀도가 같을 경우
                if (d[i][1] > d[n][1]) {     // 2순위 무게 비교
                    d[n][1] = d[i][1];
                    d[n][2] = i;
                }

            } else if (d[i][1] == d[n][1]) { // 무게가 같을 경우
                if (d[i][2] < d[n][2]) {     // 3순위 번호 비교
                    d[n][2] = i;
                }
            }

        }

        bw.write(((int) d[n][2] + 1) + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
