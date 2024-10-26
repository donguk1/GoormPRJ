package kopo.level1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class exam242374 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()) + 1;

        while (n-- > 0) {
            int i = n;
            while (i-- > 0) {
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();

    }
}
