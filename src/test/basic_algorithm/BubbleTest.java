package basic_algorithm;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("버블 정렬 테스트")
public class BubbleTest {

    @Test
    @DisplayName("버블 정렬 테스트 [7, 6, 5, 4, 3, 2, 1]  -> [1,2,3,4,5,6,7] 로 변경 되야 한다. ")
    public void ex1() {
        //given
        int[] arr = new int[]{7, 6, 5, 4, 3, 2, 1};
        Bubble bubble = new Bubble();
        //when
        bubble.sort(arr);

        //then
        assertAll(() -> assertEquals(arr[0], 1),
                () -> assertEquals(arr[1], 2),
                () -> assertEquals(arr[2], 3),
                () -> assertEquals(arr[3], 4),
                () -> assertEquals(arr[4], 5),
                () -> assertEquals(arr[5], 6),
                () -> assertEquals(arr[6],7)
        );
    }
}

