package hashmap;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

public class FIndLHS {
    public int findLHS(int[] nums) {
        if (nums == null || nums.length ==0)return 0;
        Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (Integer num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        for (Integer keyNum : map.keySet()) {
            if (map.containsKey(keyNum + 1)) {
                max = Math.max(max, map.get(keyNum) + map.get(keyNum + 1));
            }
        }
        return max;
    }
}
