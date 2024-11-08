package kopo.level1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class exam174704 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double a = Arrays.stream(br.readLine().split(" "))
                        .mapToDouble(Double::parseDouble)
                        .sum();

        bw.write(String.format("%.6f", a));
        bw.flush();
        bw.close();
        br.close();
    }
}
