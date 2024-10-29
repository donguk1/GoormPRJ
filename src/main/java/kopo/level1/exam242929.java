package kopo.level1;

import java.io.*;
import java.util.Arrays;

public class exam242929 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        bw.write(Arrays.stream(
                        br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .sum() + "");

        bw.flush();
        bw.close();
    }
}
