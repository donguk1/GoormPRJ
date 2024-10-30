package kopo.level1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class exam244330 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        int res = 0;

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());

            if (w*h > res) {
                res = w * h;
            }
        }

        bw.write(res + "");
        bw.flush();
        bw.close();
    }
}
