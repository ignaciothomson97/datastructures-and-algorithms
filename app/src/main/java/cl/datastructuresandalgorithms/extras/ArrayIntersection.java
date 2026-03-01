package cl.datastructuresandalgorithms.extras;

import java.util.*;

public class ArrayIntersection {
    public static void arrayIntersection(int[] nums1, int[] nums2) {
        // Solución típica con más uso de memoria
        Set<Integer> result = new HashSet<>();
        Set<Integer> seen = new HashSet<>();

        for (Integer num : nums1) { seen.add(num); }
        for (Integer num : nums2) { if (seen.contains(num)) result.add(num); }

        System.out.println("Result: " + result);

        // Solución con punteros (para Arrays ordenados)
        List<Integer> tempResult = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                if (tempResult.isEmpty() || nums1[i] != tempResult.get(tempResult.size() - 1)) {
                    tempResult.add(nums1[i]);
                }
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        System.out.println("Result: " + tempResult);
    }
}
