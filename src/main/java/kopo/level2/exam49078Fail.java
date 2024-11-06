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
                .mapToInt(num -> Math.abs(Integer.parseInt(num)))
                .sorted()
                .distinct()
                .toArray();

        bw.write("c : " + Arrays.toString(c) + "\n");

        int max = 0;
        int res = c[0];

        for (int i = 0; i < c.length - 1; i++) {
//            bw.write(c[i] + " ");

            if (c[i + 1] == c[i] + 1) {

//                bw.write("c[i] : " + c[i] + "\n");

                res += c[i + 1];
            } else {
                // 연속이 끊긴 경우
                max = Math.max(max, res); // 최대값을 갱신
                res = c[i + 1]; // 새 구간의 시작값으로 초기화

            }
        }

        max = Math.max(max, res);

        bw.write(max + "");

        bw.flush();
        bw.close();

    }
}
