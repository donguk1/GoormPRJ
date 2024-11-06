package kopo.level2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class exam49078Fail {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] c = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        bw.write("c : " + Arrays.toString(c) + "\n");

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (Math.abs(c[i]) > Math.abs(c[j])) {
                    int res = c[i];
                    c[i] = c[j];
                    c[j] = res;
                }
            }
        }

        bw.write("c : " + Arrays.toString(c) + "\n");

        int minus = 0;
        int max = 0;
        int res = Math.abs(c[0]);

        for (int i = 0; i < c.length - 1; i++) {
//            bw.write(c[i] + " ");

            if (Math.abs(c[i + 1]) == Math.abs(c[i] + 1)) {

//                bw.write("c[i] : " + c[i] + "\n");

                res += Math.abs(c[i + 1]);
                minus += c[i + 1];
            } else {

                max = Math.max(max, res);
                res = Math.abs(c[i + 1]);
                minus = c[i + 1];

            }
        }

        if (minus < 0) {
            bw.write("0");
        }else {
            max = Math.max(max, res);

            bw.write(max + "");
        }
        bw.flush();
        bw.close();

    }
}
