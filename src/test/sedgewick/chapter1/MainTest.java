package sedgewick.chapter1;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MainTest {

    /**
     * 1.1.1
     */
    @Test
    void one() {
        assertThat((0 + 15) / 2).isEqualTo(7);
        // 실패
        assertThat(2.0e-6 * 100000000.1).isEqualTo(200.0000002);
        assertThat(true && false || true && true).isTrue();
    }

    @Test
    void two() {
        assertThat(1 + 2 + "3").isEqualTo("33");
        assertThat(1 + 2 * 2 + "3").isEqualTo("53");
    }

    @Test
    void three() {
        assertThat(matchThreeParameter(1, 1, 2)).isFalse();
        assertThat(matchThreeParameter(1, 1, 1)).isTrue();
    }

    private boolean matchThreeParameter(int i, int i1, int i2) {
        if (i != i1 || i != i2) {
            return false;
        }
        return true;
    }

    @Test
    void five() {
        assertThat(greaterThanZeroAndLessThanOne(0.1, 0.2)).isTrue();
        assertThat(greaterThanZeroAndLessThanOne(0.1, 2)).isFalse();

    }

    private boolean greaterThanZeroAndLessThanOne(double one, double two) {
        if (one > 0 && one < 1 && two > 0 && two < 1) {
            return true;
        }
        return false;
    }

    @Test
    void seven() {
        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > 0.01)
            t = (9.0 / t + t) / 2.0;
        System.out.printf("%5f", t);
    }

//    @Test
//    void fourteen() {
//        assertThat(lg(4)).isEqualTo(2);
//        assertThat(lg(8)).isEqualTo(4);
//
//    }
//
//    private Integer lg(int n) {
//        int result = 0;
//        while (n > 1) {
//            n /= 2;
//
//        }
//
//    }
}
