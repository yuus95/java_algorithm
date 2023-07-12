package basic_algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShellTest {


    @Test
    void sort() {
        Integer[] integerArrays = new Integer[]{5,4,3,2,1,9,6};
        Shell shell = new Shell();
        shell.sort(integerArrays);

        shell.show(integerArrays);
    }
}
