package Algorithm;

import java.util.*;

public class DemKyTu {
    public static void main(String[] args) {
        String s = "aabacsdc";
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // In ra kết quả
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            result.append(entry.getValue()).append(entry.getKey()).append(",");
        }

        // Xoá dấu "," cuối
        if (result.length() > 0) {
            result.setLength(result.length() - 1);
        }

        System.out.println(result.toString()); // Output: 3a,1b,2c,1s,1d
    }
}

