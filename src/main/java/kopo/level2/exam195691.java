package kopo.level2;

import java.io.*;
import java.util.*;

public class exam195691 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] nk = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String[][] xy = new String[nk[0]][nk[0]];

        for (int i = 0; i < nk[0]; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < nk[0]; j++) {
                xy[i][j] = st.nextToken();
            }
        }

        int[][] as = new int[nk[0]][nk[0]];

        while (nk[1]-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;

            // 현재 위치 (a, b) 업데이트
            updateCell(as, xy, a, b);

            // 상하좌우 위치 업데이트
            if (a - 1 >= 0) updateCell(as, xy, a - 1, b);
            if (a + 1 < nk[0]) updateCell(as, xy, a + 1, b);
            if (b - 1 >= 0) updateCell(as, xy, a, b - 1);
            if (b + 1 < nk[0]) updateCell(as, xy, a, b + 1);
        }

        bw.write(Arrays.stream(as)
                .flatMapToInt(Arrays::stream)
                .max()
                .orElseThrow() + "");
        bw.flush();
        bw.close();
    }

    // 셀 업데이트 메소드
    private static void updateCell(int[][] as, String[][] xy, int a, int b) {
        if (Objects.equals(xy[a][b], "@")) {
            as[a][b] += 2;
        } else if (!Objects.equals(xy[a][b], "#")) {
            as[a][b] += 1;
        }
    }
}
