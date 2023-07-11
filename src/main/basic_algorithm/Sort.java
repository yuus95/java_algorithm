package basic_algorithm;

public interface Sort {
    void sort(Comparable[] arr);

    default boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    default void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    default void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println();
    }

    default boolean isSorted(Comparable[] a) {
        if (a == null || a.length == 0) {
            return false;
        }
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }
}
