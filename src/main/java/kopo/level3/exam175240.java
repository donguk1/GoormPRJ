package kopo.level3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringTokenizer;

public class exam175240 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        List<String> list = new ArrayList<String>();

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());

            String p = st.nextToken();

            if (Objects.equals(p, "push")) {
                if (list.size() >= k) {
                    bw.write("Overflow\n");
                } else {
                    list.add(st.nextToken());
                }
            } else {
                if (list.isEmpty()) {
                    bw.write("Underflow\n");
                } else {
                    bw.write(list.get(list.size() - 1) + "\n");
                    list.remove(list.size() - 1);
                }
            }

        }

        bw.flush();
        bw.close();
        br.close();

    }
}
