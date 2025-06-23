

// Cho một mảng nums có độ dài n, chứa các số nguyên trong khoảng [1, n],
//  có thể có số bị lặp, hãy trả về tất cả các số trong đoạn [1, n] không xuất hiện trong mảng.
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution{
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                result.add(i);
            }
        }

        return result;
    }

}

