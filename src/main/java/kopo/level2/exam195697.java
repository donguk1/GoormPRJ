package kopo.level2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class exam195697 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] a = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                for (int j = i + 1; j < n; j++) { // j는 i+1부터 시작
                    if (a[j] == 0) {
                        a[i] = a[j] = 0;
                    }
                }
            }
        }

        bw.write(String.valueOf(Arrays.stream(a).sum()));

        bw.flush();
        bw.close();
    }
}
