package basic_algorithm;

public class Insertion implements Sort {
    @Override
    public void sort(Comparable[] arr) {
        int N = arr.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && less(arr[j], arr[j - 1]); j--){
                System.out.println("i " + i + " j  >> " + j);
                exch(arr,j, j-1);
            }
        }
    }
}
