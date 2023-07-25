package basic_algorithm.example;

import basic_algorithm.sedgewick.Heap;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class chapter24 {

    @Test
    void twoFourOne() {
        String example = "PRIO*R**I*T*Y***QUE***U*E";
        Heap heap = new Heap(1);
        heap.insert("P");
        System.out.println();
        /*
        알파벳 : 삽입
        별표 : 최대항목 삭제
         */

    }


    public class Heap {
        private String[] pq;

        public Heap(int size) {
            this.pq = new String[size];
        }

        public void sort() {

        }

        public void insert(String string) {
            if (pq == null) {
                pq = new String[1];
                pq[0] = string;
            }

            int originalLength = pq.length;
            if(pq[originalLength-1] != null){
                pq = Arrays.copyOf(pq, pq.length * 2);
            }
            pq[originalLength] = string;
            swim(originalLength);
        }

        private void swim(int k) {
            // 상향식이므로 K는 1이되면 안된다. 아래에서 위로 올라갈 수 가 없다.
            while (k > 1 && less(k / 2, k)) {
                exch(k / 2, k);
                k = k / 2;
            }
        }


        private boolean less(int i, int j) {
            return pq[i].compareTo(pq[j]) < 0;
        }

        private void exch(int i, int j) {
            String temp = pq[i];
            pq[i] = pq[j];
            pq[j] = temp;
        }
    }
}
