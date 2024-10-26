package kopo.level1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class exam195683 {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        float w = Integer.parseInt(str[0]);
        float r = Integer.parseInt(str[1]);

        int rm = (int) (w * (1 + r / 30));

        bw.write(rm + "");
        bw.flush();
        bw.close();
        br.close();

    }
}
