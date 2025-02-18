// 2. Đề bài
// Cho một mảng số nguyên nums sắp xếp theo thứ tự tăng dần và một số nguyên target. Hãy tìm số nguyên target trong mảng nums rồi trả về index của target, nếu không tìm thấy thì trả về -1.

// Bạn phải viết một thuật toán với độ phức tạp thời gian chạy O(log n).

// Điều kiện:

// 1 <= nums.length <= 104.
// -104 < nums[i], target < 104.
// Tất cả số nguyên trong mảng nums không trùng lặp.
// nums sắp xếp theo thứ tự tăng dần.
// Ví dụ 1:

// Input: nums = [-1,0,3,5,9,12], target = 9
// Output: 4
// Explanation: 9 exists in nums and its index is 4
// Ví dụ 2:

// Input: nums = [-1,0,3,5,9,12], target = 2
// Output: -1
// Explanation: 2 does not exist in nums so return -1

public int search(int[] nums, int target) {

    return bSearch(nums, 0, nums.length - 1, target);
}

public int bSearch(int[] a, int L, int R, int target){
    if (L > R) {
        return -1;
    }

    int mid = (L + R) / 2;

    if (a[mid] == target) {
        return mid;
    }
    else if (a[mid] < target) {
        return bSearch(a, mid + 1, R, target);
    }

    return bSearch(a, L, mid - 1, target);

}

// Chúng ta có mảng nums = [-1, 0, 3, 5, 9, 12] và target = 9. 
// Đầu tiên thì index bên trái và phải ta sẽ tạm gọi là L và R sẽ có giá trị là
//  tận cùng hai đầu của mảng, hay nói cách khác L = 0 và R = n - 1 = 5.
//  Tiếp theo, để tìm index chính giữa, tạm gọi là mid ta sẽ lấy(L + R) / 2:
//  Khi này ta so sánh nums[mid] với target thì thấy 3 < 9 nên suy ra số cần tìm nằm phía bên phải của mid:
//  Ta lặp lại bước đầu tiên, nhưng lần này L = mid + 1. Ta lại tìm mid:
//  Lúc này ta so sánh nums[mid] thì thấy bằng với target, thỏa mãn điều kiện đề bài,
//     ta trả về kết quả là mid chính là index của target trong mảng nums:

