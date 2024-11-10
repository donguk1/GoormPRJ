package kopo.level2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class exam175909 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int res = 0;

        Set<String> set = new HashSet<>();

        while (m-- > 0) {
            set.add(br.readLine());
            res++;

            if (set.size() == n) {
                break;
            }
        }

        if (set.size() == n) {
            bw.write(res + "");
        } else {
            bw.write("-1");
        }

        bw.flush();
        bw.close();

    }
}
