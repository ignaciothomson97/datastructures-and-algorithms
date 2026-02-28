package cl.datastructuresandalgorithms.removeduplicates;

public class RemoveDuplicates {
    public static void removeDuplicates(int[] nums) {
        int j = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[j] != nums[i]) {
                j++;
                nums[j] = nums[i];
            }
        }

        System.out.println("J: " + (j + 1));
    }
}
