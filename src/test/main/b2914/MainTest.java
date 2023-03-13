package main.b2914;

import main.implement.b2309.SevenDwarfs;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("일곱 난쟁이")
class MainTest {

    @Test
    @DisplayName("예제 1번")
    public void ex1() {
        //given

        int[] array = new int[]{20, 7, 23, 19, 10, 15, 25, 8, 13};
        SevenDwarfs sevenDwarfs = new SevenDwarfs(array);
        int[] result = sevenDwarfs.solve();
        Assertions.assertEquals(result[0], 7);
        Assertions.assertEquals(result[1], 8);

        //when
        //then
    }
}
