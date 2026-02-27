package cl.datastructuresandalgorithms.anagramgroup;

import java.util.*;

public class AnagramGroup {
    public static void anagramGroup(String[] strings) {
        // Solución O(N * K log K)
        Map<String, List<String>> result = new HashMap<>();

        for (String s : strings) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String signature = new String(chars);
            result.computeIfAbsent(signature, k -> new ArrayList<>()).add(s);
            System.out.println("Result: " + result);
        }

        System.out.println("Map: " + new ArrayList<>(result.values()));
    }
}
