package basic_algorithm;

public class Selection implements Sort {

    @Override
    public void sort(Comparable[] arr) {
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (less(arr[j], arr[min])) {
                    min = j;
                }
            }
            exch(arr,i,min);
        }
    }
}
