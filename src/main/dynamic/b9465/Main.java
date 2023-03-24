package dynamic.b9465;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int repeatSize = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < repeatSize; i++) {
            int size = Integer.parseInt(bufferedReader.readLine());
            int[][] problem = new int[2][size];
            for (int j = 0; j < 2; j++) {
                String[] s = bufferedReader.readLine().split(" ");
                for (int k = 0; k < size; k++) {
                    problem[j][k] = Integer.parseInt(s[k]);
                }
            }

            int solve = solve(problem);
            System.out.println(solve);
        }
    }

    public static int solve(int[][] tempArray) {
        int nSize = tempArray[0].length;
        if (tempArray.length < 2 || tempArray[0].length < 1) {
            return 0;
        }
        int[][] result = new int[2][nSize];

        result[0][0] = tempArray[0][0];
        result[1][0] = tempArray[1][0];

        for (int i = 1; i < nSize; i++) {
            if (i == 1) {
                result[0][1] = tempArray[0][1] + tempArray[1][0];
                result[1][1] = tempArray[1][1] + tempArray[0][0];
                continue;
            }

            if (result[0][i - 1] > result[0][i - 2]) {
                result[1][i] = result[0][i - 1] + tempArray[1][i];
            } else {
                result[1][i] = result[0][i - 2] + tempArray[1][i];
            }

            if (result[1][i - 1] > result[1][i - 2]) {
                result[0][i] = result[1][i - 1] + tempArray[0][i];
            } else {
                result[0][i] = result[1][i - 2] + tempArray[0][i];
            }
        }


        return result[0][nSize - 1] > result[1][nSize - 1] ? result[0][nSize - 1] : result[1][nSize - 1];
    }
}
