package kopo.level2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Objects;
import java.util.StringTokenizer;

public class exam175241Fail {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] q = new int[k];

        int over = 0;
        int push = 0;
        int pop = 0;

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());

            String s = st.nextToken();

            if (Objects.equals(s, "push")) {
                if (over >= k) {
                    bw.write("Overflow\n");

                } else {
                    q[push++] = Integer.parseInt(st.nextToken());
                    if (push == k) {
                        push = 0;
                    }
                    over++;
                }
            } else if (Objects.equals(s, "pop")) {
                if (q[pop] == 0) {
                    bw.write("Underflow\n");
                } else {
                    bw.write(q[pop++] + "\n");
                    if (pop == k) {
                        pop = 0;
                    }
                    over--;
                }
            }

        }

        bw.flush();
        bw.close();
        br.close();
    }
}
