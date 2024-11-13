package kopo.level2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class exam175194 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[][] se = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            se[i][0] = Integer.parseInt(st.nextToken());    // start
            se[i][1] = Integer.parseInt(st.nextToken());    // end

        }

        Arrays.sort(se, Comparator.comparingInt(a -> a[1]));

        int res = 0;
        int end = 0;
        int start = 0;

        for (int i = 0; i < n; i++) {
            if (start < se[i][1]) {
                if (end < se[i][0]) {
                    res++;
                    end = se[i][1];
                    start = i;
                }
            }
        }

        bw.write(res + "");
        bw.flush();
        bw.close();
        br.close();

    }
}
