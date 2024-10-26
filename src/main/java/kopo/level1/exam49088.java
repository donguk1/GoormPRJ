package kopo.level1;

import java.io.*;
import java.util.stream.Stream;

public class exam49088 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int[] bro = Stream
                .of(str.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int d = Integer.parseInt(br.readLine());

        for (int i = 1; i <= d; i++) {
            if (i % 2== 0) {
                if (bro[1] % 2 != 0) {
                    bro[0]++;
                }

                bro[1] /= 2;
                bro[0] += bro[1];
            } else {
                if (bro[0] % 2 != 0) {
                    bro[1]++;
                }

                bro[0] /= 2;
                bro[1] += bro[0];
            }
        }

        bw.write(bro[0] + " " + bro[1]);
        bw.flush();
        bw.close();
        br.close();
    }
}
