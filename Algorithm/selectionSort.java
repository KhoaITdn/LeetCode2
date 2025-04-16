package Algorithm;

public class selectionSort {
        
        public static void selectionSort(int[] a) { // sắp xếp chọn, kết hợp với thuật toán sắp xếp nổi bọt và sắp xếp chèn
            int n = a.length;
            for (int i = 0; i < n - 1; i++) { // chỉ cần lặp n - 1 lần vì sau mỗi lần lặp bên ngoài thì phần tử lớn nhất đã được đưa về cuối mảng
                int minIndex = i;// tìm phần tử nhỏ nhất trong mảng
                for (int j = i + 1; j < n; j++) {
                    if (a[j] < a[minIndex]) {
                        minIndex = j;
                    }
                }
                // Swap the found minimum element with the first element
                int temp = a[minIndex];
                a[minIndex] = a[i];
                a[i] = temp;
                printArray(i, a);
            }
        }
    
        private static void printArray(int i, int[] a) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'printArray'");
        }
    
        public static void main(String[] args) {
            int[] a = {5, 1, 4, 2, 8};
            selectionSort(a);
        }
}
