class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0 ; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{}; // Trường hợp không tìm thấy
    }

    public static void main(String[] args) {
        // Tạo đối tượng Solution để gọi phương thức non-static
        Solution solution = new Solution();

        // Khai báo mảng test và target
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Gọi hàm twoSum và nhận kết quả
        int[] result = solution.twoSum(nums, target);

        // In kết quả ra màn hình
        if (result.length == 2) {
            System.out.println("Chỉ số tìm được: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("Không tìm thấy cặp nào có tổng bằng " + target);
        }
    }
}
