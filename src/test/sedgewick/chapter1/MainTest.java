package sedgewick.chapter1;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MainTest {

    /**
     * 1.1.1
     */
    @Test
    void one() {
        assertThat((0+ 15)/2).isEqualTo(7);
        // 실패
        assertThat(2.0e-6 * 100000000.1).isEqualTo(200.0000002);
        assertThat(true && false || true && true ).isTrue();
    }

    @Test
    void two() {
        assertThat(1+2+"3").isEqualTo("33");
    }

    @Test
    void three() {
        assertThat(matchThreeParameter(1,1,2)).isFalse();
        assertThat(matchThreeParameter(1,1,1)).isTrue();
    }

    private boolean matchThreeParameter(int i, int i1, int i2) {
        if(i != i1 || i != i2){
            return false;
        }
        return true;
    }
}
