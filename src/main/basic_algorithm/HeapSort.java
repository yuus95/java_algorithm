package basic_algorithm;

import java.util.Arrays;

public class HeapSort {

    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int k = N / 2; k >= 1; k--) {
            sink(a, k, N);
        }
    }

    private static Comparable[] sink(Comparable[] a, int k, int n) {
        Comparable[] temp = new Comparable[n + 1];
//        if (n == 0) {
//            return new Comparable[0];
//        }
        for (int i = 1; i <= n; i++) {
            temp[i] = a[i - 1];
        }

        while (2 * k <= n) {
            int j = 2 * k;

            if (j < n && temp[j].compareTo(temp[j + 1]) < 0) {
                j++;
            }

            if (temp[k].compareTo(temp[j]) > 0) {
                break;
            }
            Comparable tempComparable = temp[k];
            temp[k] = temp[j];
            temp[j] = tempComparable;
            k = j;
        }
        return Arrays.copyOfRange(temp,1,temp.length);
    }

    public static void main(String[] args) {
        String strings = "SORTEXAMPLE";
        String[] result = strings.split("");

        Comparable[] resultComparable = HeapSort.sink(result, 5, 11);
        System.out.print("item -> ");

        Arrays.stream(resultComparable).forEach(item ->
                System.out.print("" + item)
        );
        System.out.println("");

        System.out.println("item -> ");
        Comparable[] resultComparable1 = HeapSort.sink(resultComparable, 4, 11);
        Arrays.stream(resultComparable1).forEach(item ->
                System.out.print("" + item)
        );
    }
}
