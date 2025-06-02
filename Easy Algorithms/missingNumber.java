// cách 1 dùng hashset để duyệt qua các phân tử rồi sau đó sẽ xem xem phần 
// thử index đó có ở hashset vừa duyệt hay không
// nếu không có thì in ra index đó 

import java.util.HashSet;
import java.util.Set;

class Solution {

    public int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        for (int i = 0; i <= nums.length; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return -1; // không xảy ra nếu đầu vào hợp lệ
    }

    // cách 2 : dùng công thức sum- sumofnum
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

}
