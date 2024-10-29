package kopo.level1;

import java.io.*;
import java.util.Objects;
import java.util.StringTokenizer;

public class exam171192 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        long res = 0;

        String str = "success";

        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String c = st.nextToken();
            long v = Long.parseLong(st.nextToken());

            if (Objects.equals(c, "in")) {
                res += v;
            } else if (Objects.equals(c, "out")) {
                res -= v;
            }

            if (res < 0) {
                str = "fail";
            }
        }

        bw.write(str);
        bw.flush();
        bw.close();
        br.close();
    }
}
