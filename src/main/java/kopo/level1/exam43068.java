package kopo.level1;

import java.io.*;
import java.util.stream.Stream;

public class exam43068 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        while(t-- > 0){
            int[] x = Stream
                    .of(br.readLine().split(" "))
                    .mapToInt(num -> Math.abs(Integer.parseInt(num)))
                    .toArray();

            if ((x[0] + x[1]) <= x[2]) {
                if ((x[2] - x[0] - x[1]) % 2 == 0) {
                    bw.write("YES\n");
                    continue;
                }
            }
            bw.write("NO\n");

        }
        bw.flush();
        bw.close();
        br.close();
    }
}
