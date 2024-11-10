package kopo.level2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class exam174760 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String n = br.readLine();
        String s = br.readLine();
        String e = br.readLine();

        while (e.contains(s)) {
            e = e.replaceAll(s, "");
        }

        if (e.isEmpty()) {
            bw.write("EMPTY");
        } else {
            bw.write(e);
        }

        bw.flush();
        bw.close();

    }
}
