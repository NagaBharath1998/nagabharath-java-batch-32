package june20;

import java.util.HashMap;
import java.util.Map;

public class Main1 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50, 60};
        int target = 100;
        int[] indices = findTwoSum(nums, target);

        if (indices != null) {
            System.out.println("Indices of the two numbers that add up to the target sum:");
            System.out.println("[" + indices[0] + ", " + indices[1] + "]");
        } else {
            System.out.println("No two numbers found that add up to the target sum.");
        }
    }

    public static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> numIndexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numIndexMap.containsKey(complement)) {
                return new int[]{numIndexMap.get(complement), i};
            }
            numIndexMap.put(nums[i], i);
        }

        return null;
    }
}

