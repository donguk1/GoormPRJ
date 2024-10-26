package kopo;

import java.io.*;
import java.util.StringTokenizer;

public class exam47883 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        bw.write(st.countTokens() + "");
        bw.flush();
        bw.close();
        br.close();

    }
}
