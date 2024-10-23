package kopo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Objects;

public class exam195685 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        int res = 0;
        while (t-- > 0) {
            String[] str = br.readLine().split(" ");


            if(Objects.equals(str[1], "+")) {
                res += Integer.parseInt(str[0]) + Integer.parseInt(str[2]);

            } else if(Objects.equals(str[1], "-")) {
                res += Integer.parseInt(str[0]) - Integer.parseInt(str[2]);

            } else if(Objects.equals(str[1], "*")) {
                res += Integer.parseInt(str[0]) * Integer.parseInt(str[2]);

            } else if(Objects.equals(str[1], "/")) {
                res += Integer.parseInt(str[0]) / Integer.parseInt(str[2]);

            } else if(Objects.equals(str[1], "%")) {
                res += Integer.parseInt(str[0]) % Integer.parseInt(str[2]);

            }
        }

        br.close();
        bw.write(res + "");
        bw.flush();
        bw.close();
    }
}
