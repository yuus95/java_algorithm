package basic_algorithm;

import org.assertj.core.api.AbstractSoftAssertions;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class SelectionTest {

    @Test
    void sort() {
        Integer[] intArray = new Integer[]{5, 4, 3, 2, 1};

        Selection selection = new Selection();
        selection.sort(intArray);
        boolean sorted = selection.isSorted(intArray);
        assertThat(sorted).isTrue();
    }
}
