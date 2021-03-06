package sort;

import java.util.*;

public class TopKFrequent {
    public static int[]topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyForNum = new HashMap<Integer, Integer>();
        for (int num : nums) {
            frequencyForNum.put(num, frequencyForNum.getOrDefault(num, 0) + 1);
        }
        ArrayList<Integer>[] buckets = new ArrayList[nums.length+1];
        for (Integer key : frequencyForNum.keySet()) {
            Integer frequency = frequencyForNum.get(key);
            if(buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<Integer>();
            }
            buckets[frequency].add(key);
        }
        List<Integer> topK = new ArrayList<Integer>();
        for (int i = buckets.length - 1; i >=0 && topK.size() < k ; i--) {
            if(buckets[i] == null) {
                continue;
            }
            if (buckets[i].size() <= (k - topK.size())) {
                topK.addAll(buckets[i]);
            }else {
                topK.addAll(buckets[i].subList(0, k - topK.size()));
            }
        }
        int[] top = new int[topK.size()];
        for (int i = 0; i < topK.size(); i++) {
            top[i] = topK.get(i);
        }
        return top;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(topKFrequent(nums, 1));
    }
}
