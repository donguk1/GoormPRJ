package kopo.level1;

import java.io.*;

public class exam195684 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] hm = br.readLine().split(" ");
        int h = Integer.parseInt(hm[0]);
        int m = Integer.parseInt(hm[1]);

        while(n-- != 0) {
            int i = Integer.parseInt(br.readLine());
            // h += i % 24;
            m += i;

        }

        while(m > 59) {
            h++;
            m -= 60;
        }

        if (h > 23) {
            h%=24;
        }

        bw.write(h + " " + m);
        bw.flush();
        bw.close();
        br.close();

    }
}
