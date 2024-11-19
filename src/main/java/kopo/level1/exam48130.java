package kopo.level1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class exam48130 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            /**
             * 별        : 4
             * 동그라미   : 3
             * 네모      : 2
             * 세모      : 1
             */

            int[] a = Arrays.stream(br.readLine().split(" "))
                    .skip(1)
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int[] b = Arrays.stream(br.readLine().split(" "))
                    .skip(1)
                    .mapToInt(Integer::parseInt)
                    .toArray();

            bw.write("a : " + Arrays.toString(a) + "\n");
            bw.write("b : " + Arrays.toString(b) + "\n");

            int[] ac = check(a);
            int[] bc = check(b);

            bw.write("a : " + Arrays.toString(ac) + "\n");
            bw.write("b : " + Arrays.toString(bc) + "\n");

            for (int i = 3; i >= 0; i--) {
                if (ac[i] > bc[i]) {
                    bw.write("A\n");
                    break;
                } else if (ac[i] < bc[i]) {
                    bw.write("B\n");
                    break;
                } else if (i == 0){
                    if (ac[i] > bc[i]) {
                        bw.write("A\n");
                        break;
                    } else if (ac[i] < bc[i]) {
                        bw.write("B\n");
                        break;
                    } else {
                        bw.write("D\n");
                    }
                }
            }
        }
        bw.write("\n");
        bw.flush();
        bw.close();
        br.close();
    }

    public static int[] check(int[] i) {

        int[] n = new int[4];

        List<Integer> list = Arrays.stream(i)
                .boxed()
                .collect(Collectors.toList());

        for (int j = 0; j < 4; j++) {
            n[j] = Collections.frequency(list, j+1);
        }

        return n;
    }
}
