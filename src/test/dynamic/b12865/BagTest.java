package dynamic.b12865;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static dynamic.b12865.Main.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("평범한 배낭")
class BagTest {

    @Test
    @DisplayName("예제1  답 14")
    public void ex1() {
        //given
        List<Bag> bagList = new ArrayList<>();
        bagList.add(new Bag(6, 13));
        bagList.add(new Bag(4, 8));
        bagList.add(new Bag(3, 6));
        bagList.add(new Bag(5, 12));

        int[] result = new int[8];

        bagList.forEach(bag -> {
            int weight = bag.getWeight();
            int value = bag.getValue();
            if (result[weight] < value) {
                result[weight] = value;
            }
        });

        int mod = 7 / 2;
        for (int i = 6; i > mod; i--) {
            if (result[7] < result[i] + result[7 - i]) {
                result[7] = result[i] + result[7 - i];
            }
        }

        Assertions.assertEquals(result[7],14);
    }
}