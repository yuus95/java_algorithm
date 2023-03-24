package dynamic.b9465;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("9465번 스티커")
class StickerTest {

    @Test
    @DisplayName("5\n" +
            "50 10 100 20 40\n" +
            "30 50 70 10 60 의 스티커 260의 값을 나타낸다.")
    public void ex1() throws IOException {

        int[][] tempArray = new int[][]{{50, 10, 100, 20, 40}, {30, 50, 70, 10, 60}};
        Sticker sticker = new Sticker();

        Assertions.assertEquals(sticker.solve(tempArray), 260);
    }

    @Test
    @DisplayName("7\n" +
            "10 30 10 50 100 20 40\n" +
            "20 40 30 50 60 20 80   -> 290 이 나와야한다")
    public void ex2() throws IOException {

        int[][] tempArray = new int[][]{{10, 30, 10, 50, 100, 20, 40}, {20, 40, 30, 50, 60, 20, 80}};
        Sticker sticker = new Sticker();

        Assertions.assertEquals(sticker.solve(tempArray), 290);
    }
}