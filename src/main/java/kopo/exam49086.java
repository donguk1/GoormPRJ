package kopo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class exam49086 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Integer.parseInt(br.readLine()) + 1;

        long res = 0;

        while (n-- > 0) {
            res += n * n;
        }

//        long res = n * (n + 1) * (2 * n + 1) / 6;

        bw.write(res + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
