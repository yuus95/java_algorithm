package basic_algorithm;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class InsertionTest {

    @Test
    void Insertion() {
        Insertion insertion = new Insertion();
        Integer[] integerArray = {4, 5, 3, 2, 1};
        insertion.sort(integerArray);
        boolean result = insertion.isSorted(integerArray);
        insertion.show(integerArray);
        assertThat(result).isTrue();
    }
}
