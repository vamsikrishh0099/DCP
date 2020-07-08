import java.util.*;


class Solution {
    public boolean solve(int[] nums, int k) {
        List<Integer> n1 = new ArrayList<Integer>();
        int i = 0;
        while(i < nums.length) {
            if(n1.contains(k-nums[i]))
                return true;
            n1.add(nums[i]);
            i++;
        }
        return false;
    }
}

// Time Complexity : O(n)
//Space Complexity : O(n)
