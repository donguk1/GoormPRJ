package kopo.level1;

import java.io.*;
import java.util.StringTokenizer;

public class exam242429 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a < b) {
                bw.write("Sunflower" + "\n");
            } else if (a == b) {
                bw.write("Tulip" + "\n");
            } else {
                bw.write("Rose" + "\n");
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
