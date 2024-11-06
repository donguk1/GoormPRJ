package kopo.level2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class exam191048 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        long res = 0;

        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int t = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            if (res < t) {
                res = t + w;
            } else {
                res += w;
            }

            bw.write(res + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
