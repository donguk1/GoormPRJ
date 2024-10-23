package kopo;

import java.io.*;

public class exam159665 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        int res = 1;

        String str = br.readLine();

        char a = str.charAt(0);

        for(int i=1; i<input; i++) {
            if(a != str.charAt(i)) {
                res++;
            }
            a = str.charAt(i);
        }

        bw.write(res + "");
        bw.flush();
        bw.close();

    }
}
