package kopo.level1;

import java.io.*;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class exam242879 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] nm = Stream
                .of(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        while (nm[0]-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int c = Integer.parseInt(st.nextToken());
            int u = Integer.parseInt(st.nextToken());

            nm[1] -= c*u;

            if (nm[1] < 0) {
                bw.write("No");
                break;
            }
        }

        if (nm[1] >= 0) {
            bw.write(nm[1] + "");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
