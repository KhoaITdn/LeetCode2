package Algorithm;

public class SelectionSort {

    public static void selectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;

            printArray(i, a);
        }
    }

    private static void printArray(int i, int[] a) {
        System.out.print("Lần lặp " + (i + 1) + ": ");
        for (int x : a) System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {5, 1, 4, 2, 8};
        selectionSort(a);
    }
}
