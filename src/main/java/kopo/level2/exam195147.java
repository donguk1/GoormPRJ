package kopo.level2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class exam195147 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] x = new int[q][3];
        int[][] y = new int[q][3];

        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 3; j++) {
                x[i][j] = Integer.parseInt(st.nextToken()) - 1;
                y[i][j] = Integer.parseInt(st.nextToken()) - 1;
            }
        }

        for (int i = 0; i < q; i++) {
            int res = 0;

            int yMinIndex = minIndex(y[i]);
            int xMinIndex = minIndex(x[i]);

            int yMinCount = count(y[i], y[i][yMinIndex]);
            int xMinCount = count(x[i], x[i][xMinIndex]);

            int yMaxValue = Arrays.stream(y[i]).max().orElse(0);
            int yMinValue = Arrays.stream(y[i]).min().orElse(0);
            int xMaxValue = Arrays.stream(x[i]).max().orElse(0);
            int xMinValue = Arrays.stream(x[i]).min().orElse(0);

            if (yMinCount  == 2 && xMinCount == 1) {
                int max = 0;
                for (int j = xMinValue; j <= xMaxValue; j++) {
                    int start = 0;
                    for (int k = yMinValue; k <= yMaxValue ; k++) {
                        res += a[j][k];
                        if (max == start) {
                            break;
                        }
                        start++;
                    }
                    max++;
                }
            } else if (yMinCount  == 1 && xMinCount == 2) {
                int max = xMaxValue - xMinValue;
                for (int j = xMinValue; j <= xMaxValue; j++) {
                    int start = 0;
                    for (int k = yMaxValue; k >= yMinValue ; k--) {
                        res += a[j][k];
                        if (max == start) {
                            break;
                        }
                        start++;
                    }
                    max--;
                }
            } else if (yMinCount  == 2 && xMinCount == 2) {
                int max = xMaxValue - xMinValue;
                for (int j = xMinValue; j <= xMaxValue; j++) {
                    int start = 0;
                    for (int k = yMinValue; k <= yMaxValue ; k++) {
                        res += a[j][k];
                        if (max == start) {
                            break;
                        }
                        start++;
                    }
                    max--;
                }
            } else if (yMinCount  == 1 && xMinCount == 1) {
                int max = 1;
                for (int j = xMinValue; j <= xMaxValue; j++) {
                    int start = 1;
                    for (int k = yMaxValue; k >= yMinValue ; k--) {
                        res += a[j][k];
                        if (max == start) {
                            break;
                        }
                        start++;
                    }
                    max++;
                }
            }
            bw.write(res + "\n");

        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static int minIndex(int[] array) {
        int minIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int maxIndex(int[] array) {
        int maxIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] >= array[maxIndex]) {
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    public static int count(int[] array, int index) {
        int count = 0;

        for (int a : array) {
            if (a == index) {
                count++;
            }
        }

        return count;
    }

}
