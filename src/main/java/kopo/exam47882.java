package kopo;

import java.io.*;

public class exam47882 {

    public static String str;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        str = br.readLine();

        bw.write(count('1') + "\n");
        bw.write(count('I') + "\n");
        bw.write(count('l') + "\n");
        bw.write(count('|') + "\n");

        bw.flush();
        bw.close();

    }

    public static long count(char n) {
        return str.chars()
                .filter(c -> c == n)
                .count();

    }
}
