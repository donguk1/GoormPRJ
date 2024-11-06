package kopo.level2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class exam162066 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String s = br.readLine();

        for (int i = 0; i < n; i+=2) {
            int asc = (byte) s.charAt(i);

            int a = Integer.parseInt(String.valueOf(s.charAt(i+1)));

            asc += a*a;

            while (asc > 122) {
                asc -= 26;
            }

            bw.write((char) asc);
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
