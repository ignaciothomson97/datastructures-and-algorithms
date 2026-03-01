package cl.datastructuresandalgorithms.extras;

import java.util.Arrays;

public class SortedSquaredArray {

    public static void sortedSquaredArray(int[] nums) {
        int[] result = new int[nums.length];

        int left = 0;
        int right = nums.length - 1;
        int p = nums.length - 1;

        // No dejar como p > 0, porque estaríamos obviando el primer índice (0)
        while (p >= 0) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare < rightSquare) {
                result[p] = rightSquare;
                right--;
            } else {
                result[p] = leftSquare;
                left++;
            }
            p--;
        }

        System.out.println("Result: " + Arrays.toString(result));
    }

}
