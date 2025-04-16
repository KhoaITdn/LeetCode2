public class bubleSort{

    public static void main(String[] args){

        int n = a.length;
        for (int i = 0 , i < n; i ++){
            boolean isSorted = true; // biến kiểm tra mảng đã được sắp xếp hay chưa
            for (int j = 0; j < n - i - 1; j++){ // n - i - 1 là số lần lặp của vòng lặp bên trong , chỉ cần lặp n - i - 1 lần vì sau mỗi lần lặp bên ngoài thì phần tử lớn nhất đã được đưa về cuối mảng
                if (a[j] > a[j + 1]){ // nếu phần từ đứng trc lớn hơn phần tử đứng sau thì đổi chỗ 
                    // swap a[j] and a[j + 1]
                    isSorted = false; // nếu có hoán đổi thì gán biến kiểm tra là false
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            printArray(i,a);
            if(isSorted)
            {
                break; // nếu mảng đã được sắp xếp thì dừng vòng lặp
            }
        }



    }

    public static void main(String[] args) {
        int[] a = {5, 1, 4, 2, 8};
        bubleSort(a);
    }
}

