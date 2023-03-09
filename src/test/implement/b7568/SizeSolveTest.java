package implement.b7568;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

@DisplayName("7568번 - 덩치")
public class SizeSolveTest {

    @Test
    @DisplayName("(88,186) 1등 - (55,185) 2등  (58 183) 2등 (60 175) 2등  46 155  5등  " )
    public void ex1(){
        //given
        SizeSolve sizeSolve = new SizeSolve();
        SizeSolve.Human human1 = new SizeSolve.Human(88, 186);
        SizeSolve.Human human2 = new SizeSolve.Human(55, 185);
        SizeSolve.Human human3 = new SizeSolve.Human(58, 183);
        SizeSolve.Human human4 = new SizeSolve.Human(60, 175);
        SizeSolve.Human human5 = new SizeSolve.Human(46, 155);
        List<SizeSolve.Human>  humanList = new ArrayList<>();
        humanList.add(human1);
        humanList.add(human2);
        humanList.add(human3);
        humanList.add(human4);
        humanList.add(human5);
        sizeSolve.solve(humanList);

        Assertions.assertEquals(human1.rank,1);
        Assertions.assertEquals(human2.rank,2);
        Assertions.assertEquals(human3.rank,2);
        Assertions.assertEquals(human4.rank,2);
        Assertions.assertEquals(human5.rank,5);
    }
}
