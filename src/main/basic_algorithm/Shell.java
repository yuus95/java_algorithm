package basic_algorithm;

/**
 * 하나의 시퀀스를 정하여 시퀀스 만큼 떨어진 거리의 값과 비교할 수 있다.
 * 최악의 경우 맨 첫번째가 제일 높은 수여도 n-1 번 교체하지 않아도 된다.
 */
public class Shell implements Sort {
    @Override
    public void sort(Comparable[] arr) {
        int N = arr.length;
        int h = 1;
        while (h < N / 3) {
            h = 3 * h + 1;
        }

        while (h >= 1) {
            for (int i = h; i < N; i++) {
                System.out.println();
                for (int j = i; j >= h && less(arr[j], arr[j - h]); j -= h) {
                    System.out.println("i " + i + " j " + j + " h " + h);
                    exch(arr, j, j - h);
                }
            }

            h = h / 3;
        }
    }
}
