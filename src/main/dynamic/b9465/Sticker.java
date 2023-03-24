package dynamic.b9465;

public class Sticker {
    public int solve(int[][] tempArray) {
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
