package Algorithm;

public class insertionSort {
    
    public static void insertionSort(int[] a) { // giống như đánh bài tây 
        int n = a.length;
        for (int i = 1; i < n; i++) { // bắt đầu từ phần tử thứ 2
            // vì phần tử đầu tiên đã được sắp xếp rồi
            // tìm vị trí chèn cho phần tử thứ
            int key = a[i]; // phần tử cần chèn 
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printArray'");
    }

    public static void main(String[] args) {
        int[] a = {5, 1, 4, 2, 8};
        insertionSort(a);
    }
}
