package kopo.level1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class exam174805 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        String k = st.nextToken();

        st = new StringTokenizer(br.readLine());

        List<String> a = new ArrayList<>();

        while (n-- > 0) {
            String s = st.nextToken();

            if (!s.contains(k)) {
                a.add(s);
            }
        }

        bw.write(a.size() + "\n");
        bw.flush();
        bw.close();
    }
}
