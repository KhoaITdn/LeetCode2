
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
    int[] list = new int [nums.length];
    for(int i = 0; i< nums.length ; i++){
        int count = 0;
       for (int j =0 ;j< nums.length; j++){
            if (nums[i] > nums[j]  ){
                count++;

            }
       }
            list[i] = count;
            
        }
        return list;
    }
}
