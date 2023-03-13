package main.implement.b2309;

import java.util.Arrays;

public class SevenDwarfs {
    private int[] inputArray;

    public SevenDwarfs(int[] inputArray) {
        this.inputArray = inputArray;
    }

    //    20, 7, 23, 19, 10, 15, 25, 8, 13
    public int[] solve() {
        int[] result = new int[7];
        int sum;
        boolean success = false;
        int x = 0;
        int y = 0;

        //100이 되는지 확인
        for (int i = 0; i < 9; i++) {
            if (success) break;
            for (int j = i + 1; j < 9; j++) {
                sum = 0;
                int count = 0;
                if (success) break;
                for (int k = 0; k < 9; k++) {
                    if (k == i || k == j) {
                        continue;
                    }
                    sum += inputArray[k];
                    count += 1;
                    if (sum == 100 && count == 7) {
                        success = true;
                        break;
                    }
                }
            }
        }

        int number = 0;

        for (int a = 0; a < 9; a++) {
            if (a != x && a != y && number < 7) {
                result[number] = inputArray[a];
                number += 1;
            }
        }

        for (int a = 1; a < 7; a++) {
            for (int b = a; b >= 1; b--) {
                if (result[b] < result[b - 1]) {
                    int temp = result[b-1];
                    result[b - 1] = result[b];
                    result[b] = temp;
                } else {
                    break;
                }
            }
        }
        //정렬
        Arrays.sort(result);
        return result;
    }

    public void print() {
        int[] solve = this.solve();
        for (int i = 0; i < 7; i++) {
            System.out.println(solve[i]);
        }
    }
}
