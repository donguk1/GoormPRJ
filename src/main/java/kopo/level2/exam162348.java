package kopo.level2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Objects;

public class exam162348 {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String s = br.readLine();
            String[] p = br.readLine().split(" ");

            char[] ch = s.toCharArray();

            if (Objects.equals(p[0], "E")) {
                int token = 0;

                for (int i = 0; i < ch.length; i++) {
                    int ci = (byte) ch[i];
                    int ct = (byte) p[1].charAt(token);

                    token++;

                    if (token == p[1].length()) {
                        token = 0;
                    }

                    if (ci >= 65 && ci <= 90) {
                        ci += ct;
                        while (ci > 90) {
                            ci -= 26;
                        }
                    } else if (ci >= 97 && ci <= 122) {
                        ci += ct;
                        while (ci > 122) {
                            ci -= 26;
                        }
                    }
                    bw.write((char) ci + "");

                }

            } else {
                int token = 0;

                for (int i = 0; i < ch.length; i++) {
                    int ci = (byte) ch[i];
                    int ct = (byte) p[1].charAt(token);

                    token++;

                    if (token == p[1].length()) {
                        token = 0;
                    }

                    if (ci >= 65 && ci <= 90) {
                        ci -= ct;
                        while (ci < 65) {
                            ci += 26;
                        }
                    } else if (ci >= 97 && ci <= 122) {
                        ci -= ct;
                        while (ci < 97) {
                            ci += 26;
                        }
                    }
                    bw.write((char) ci + "");
                }
            }
            bw.write("\n");

        }
        bw.flush();
        bw.close();
        br.close();
    }
}
