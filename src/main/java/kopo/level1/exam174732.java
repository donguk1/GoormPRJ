package kopo.level1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class exam174732 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String s = br.readLine();

        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                bw.write(Character.toLowerCase(c) + "");
            } else {
                bw.write(Character.toUpperCase(c) + "");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
