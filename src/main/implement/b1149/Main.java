package implement.b1149;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Integer size = Integer.parseInt(bufferedReader.readLine());
        Rgb rgbClass = new Rgb();

        int[][] rgb = new int[size][3];
        for (int i = 0; i < size; i++) {
            String[] width = bufferedReader.readLine().split(" ");
            rgb[i][0] = Integer.parseInt(width[0]);
            rgb[i][1] = Integer.parseInt(width[1]);
            rgb[i][2] = Integer.parseInt(width[2]);
        }

        int solve = rgbClass.solve(rgb, size);

        System.out.println(solve);

    }


    public static class Rgb {
        public int solve(int[][] rgb, int size) {
            if (size < 2) {
                return 0;
            }

            for (int i = 1; i < size; i++) {
                rgb[i][0] = rgb[i][0] + rgb[i - 1][1] > rgb[i][0] + rgb[i - 1][2] ? rgb[i][0] + rgb[i - 1][2] : rgb[i][0] + rgb[i - 1][1];
                rgb[i][1] = rgb[i][1] + rgb[i - 1][0] > rgb[i][1] + rgb[i - 1][2] ? rgb[i][1] + rgb[i - 1][2] : rgb[i][1] + rgb[i - 1][0];
                rgb[i][2] = rgb[i][2] + rgb[i - 1][0] > rgb[i][2] + rgb[i - 1][1] ? rgb[i][2] + rgb[i - 1][1] : rgb[i][2] + rgb[i - 1][0];
            }
            return Math.min(Math.min(rgb[size - 1][0], rgb[size - 1][1]), rgb[size - 1][2]);
        }
    }
}
