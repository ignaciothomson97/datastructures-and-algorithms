package cl.datastructuresandalgorithms.extras;

import java.util.Arrays;

public class ReverseArray {
    public static void reverseArray(String[] words) {
        int left = 0;
        int right = words.length - 1;

        while (left < right) {
            String temp = words[left];

            words[left] = words[right];
            words[right] = temp;

            left++;
            right--;
        }

        System.out.println(Arrays.toString(words));
    }
}
