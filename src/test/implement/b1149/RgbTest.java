package implement.b1149;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("1149번 RGB")
class RgbTest {
    Main.Rgb rgb = new Main.Rgb();

    @Test
    @DisplayName("예제1번  96")
    public void ex1(){
    //given
        int [][] array = new int[][]{ {26,40,83} , {49, 60, 57} , {13, 89 , 99}};
        int solve = rgb.solve(array , 3);
        Assertions.assertEquals(solve, 96);
    }

    @Test
    @DisplayName("예제2번 3")
    public void ex2(){
        int [][] array = new int[][]{ {1,100,100} , {100, 1, 100} , {100, 100 , 1}};
        int solve = rgb.solve(array, 3);
        Assertions.assertEquals(solve, 3);
    }

}
