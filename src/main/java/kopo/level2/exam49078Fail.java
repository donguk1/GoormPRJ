package kopo.level2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class exam49078Fail {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] c = Arrays.stream(br.readLine().split(" "))
                .mapToInt(num -> Math.abs(Integer.parseInt(num)))
                .sorted()
                .toArray();

        bw.write("c : " + Arrays.toString(c) + "\n");

//        for (int i = 0; i < n; i++) {
//            for (int j = i+1; j < n; j++) {
//                if (Math.abs(c[i]) > Math.abs(c[j])) {
//                    int res = c[i];
//                    c[i] = c[j];
//                    c[j] = res;
//                }
//            }
//        }
//        bw.write("c : " + Arrays.toString(c) + "\n");

        int max = 0;
        int res = c[0];
        List<Integer> list = new ArrayList<>(c[0]);

        for (int i = 0; i < c.length - 1; i++) {
//            bw.write(c[i] + " ");

            if (c[i + 1] == c[i] + 1) {

//                bw.write("c[i] : " + c[i] + "\n");

                res += c[i + 1];
                list.add(i+1);
            } else {

                if (max < res) {
                    list.clear();
                    list.add(i+1);

                }

                max = Math.max(max, res);
                res = c[i + 1];

            }
            bw.write(list.size() + "/" + list + "\n");
        }

        max = Math.max(max, res);

        bw.write(max + "\n");

        bw.flush();
        bw.close();

    }
}
