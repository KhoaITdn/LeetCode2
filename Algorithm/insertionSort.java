package Algorithm;

public class InsertionSort {

    public static void insertionSort(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;

            printArray(i, a);
        }
    }

    private static void printArray(int i, int[] a) {
        System.out.print("Lần lặp " + (i) + ": ");
        for (int x : a) System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {5, 1, 4, 2, 8};
        insertionSort(a);
    }
}
