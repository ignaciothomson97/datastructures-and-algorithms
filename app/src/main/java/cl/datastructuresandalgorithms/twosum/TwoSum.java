package cl.datastructuresandalgorithms.twosum;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void twoSum(int[] nums, int target) {
        // Enfoque de  brute force, O(N^2)
        int[] indexes = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    indexes[0] = i;
                    indexes[1] = j;
                }
            }
        }
        System.out.println("Indexes: " + Arrays.toString(indexes));

        // Esta es la solución más óptima O(N)
        HashMap<Integer, Integer> seen = new HashMap<>();
        int[] indexes2 = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];
            if (seen.containsKey(remainder)) {
                indexes2[0] = seen.get(remainder);
                indexes2[1] = i;
            }
            seen.put(nums[i], i);
        }
        System.out.println("Indexes 2: " + indexes2);
    }

}
