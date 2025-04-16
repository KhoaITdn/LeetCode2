import java.util.Arrays;

public class SearchAlgorithms {

    // 1️⃣ Tìm kiếm tuyến tính (Linear Search)
    public static int linearSearch(int[] array, int x) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x)
                return i;
        }
        return -1; // Không tìm thấy
    }

    // 2️⃣ Tìm tất cả vị trí xuất hiện
    public static void findAllOccurrences(int[] array, int x) {
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                System.out.println("Phần tử " + x + " xuất hiện tại vị trí: " + i);
                found = true;
            }
        }
        if (!found)
            System.out.println("Không tìm thấy phần tử " + x);
    }

    // 3️⃣ Tìm kiếm nhị phân (Binary Search) — mảng phải được sắp xếp
    public static int binarySearch(int[] array, int x) {
        int left = 0, right = array.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (array[mid] == x)
                return mid;
            else if (array[mid] < x)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1; // Không tìm thấy
    }

    // 📌 Main để test các hàm tìm kiếm
    public static void main(String[] args) {
        int[] numbers = {5, 2, 7, 5, 9, 5, 3, 6};
        int x = 5;

        System.out.println("Linear Search:");
        int linearResult = linearSearch(numbers, x);
        if (linearResult != -1)
            System.out.println("Tìm thấy phần tử " + x + " tại vị trí: " + linearResult);
        else
            System.out.println("Không tìm thấy phần tử " + x);

        System.out.println("\nTìm tất cả vị trí xuất hiện:");
        findAllOccurrences(numbers, x);

        System.out.println("\nBinary Search (Cần mảng đã sắp xếp):");
        int[] sortedNumbers = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(sortedNumbers);
        int binaryResult = binarySearch(sortedNumbers, x);
        if (binaryResult != -1)
            System.out.println("Tìm thấy phần tử " + x + " tại vị trí (mảng đã sắp xếp): " + binaryResult);
        else
            System.out.println("Không tìm thấy phần tử " + x);
    }
}
