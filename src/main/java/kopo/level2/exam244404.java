package kopo.level2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.stream.Stream;

public class exam244404 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] n = Stream
                .of(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] a = Stream
                .of(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        if (n[0] == 1) {
            bw.write(a[0] + "");

        } else {
            int x = 0;

            while (n[1]-- > 0) {
                x += a[x];

                while (x > n[0]-1) {
                    x -= n[0];

                }
            }
            bw.write(a[x] + "");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
