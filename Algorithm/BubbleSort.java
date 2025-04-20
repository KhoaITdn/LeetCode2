package Algorithm;

public class BubbleSort {

    public static void bubbleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            boolean isSorted = true;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    isSorted = false;
                }
            }
            printArray(i, a);
            if (isSorted) break;
        }
    }

    private static void printArray(int i, int[] a) {
        System.out.print("Lần lặp " + (i + 1) + ": ");
        for (int x : a) System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {5, 1, 4, 2, 8};
        bubbleSort(a);
    }
}
