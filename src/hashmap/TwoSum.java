package hashmap;

import java.util.*;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) return null;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(i, nums[i]);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        int i = 0, j = nums.length - 1;
        int[] result = new int[2];
        while (i < j) {
            int sum = list.get(i).getValue() + list.get(j).getValue();
            if (sum < target) {
                i++;
            }else if (sum > target) {
                j--;
            }else {
                result[0] = list.get(i).getKey();
                result[1] = list.get(j).getKey();
                return result;
            }
        }
        return null;
    }
    public int[] towsum2(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                return new int[]{hashMap.get(target - nums[i]), i};
            }else {
                hashMap.put(nums[i], i);
            }
        }
        return null;
    }
}
