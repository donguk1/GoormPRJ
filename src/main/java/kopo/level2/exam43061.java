package kopo.level2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class exam43061 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] max = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] start = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int k = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        int res;

        while (n-- > 0) {
            res = start[n] + k;
            start[n] = res % (max[n] + 1);
            k = res / (max[n] + 1);

            sb.append(start[n]);
        }

        while (start[0] > max[0]) {
            start[0] -= max[0];
        }



        bw.write(sb.reverse().toString());
        bw.flush();
        bw.close();

    }
}