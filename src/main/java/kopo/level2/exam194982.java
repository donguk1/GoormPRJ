package kopo.level2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class exam194982 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 집의 개수
        int m = Integer.parseInt(st.nextToken()); // 장마 기간

        int[] k = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[][] s = new int[m][2];

        for (int i = 0; i < m; i++) {
            s[i] = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            for (int j = s[i][0]-1; j <= s[i][1]-1; j++) {
                k[j]++;
            }

            if ((i+1) % 3 == 0) {
                Set<Integer> set = check(s, i);

                for (int e : set) {
                    k[e-1]--;

                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (i > 0) {
                bw.write(" ");
            }
            bw.write(String.valueOf(k[i]));
        }
        bw.flush();
        bw.close();
    }

    public static Set<Integer> check(int[][] s, int t) {

        Set<Integer> set = new HashSet<>();

        for (int i = t-2; i <= t; i++) {
            for (int j = s[i][0]; j <= s[i][1]; j++) {
                set.add(j);
            }
        }
        return set;
    }
}
