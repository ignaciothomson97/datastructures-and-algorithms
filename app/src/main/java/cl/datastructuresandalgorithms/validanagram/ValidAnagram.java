package cl.datastructuresandalgorithms.validanagram;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void validAnagram(String s1, String s2) {
        // Solución O(N)
        Map<Character, Integer> s1Frequency = new HashMap<>();
        Map<Character, Integer> s2Frequency = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            s1Frequency.put(s1.charAt(i), s1Frequency.getOrDefault(s1.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s2.length(); i++) {
            s2Frequency.put(s2.charAt(i), s2Frequency.getOrDefault(s2.charAt(i), 0) + 1);
        }
        System.out.println(s1Frequency.equals(s2Frequency));

        /* No consideré el caso base inicialmente, si s1 y s2 tienen largos diferentes NO SON ANAGRAMAS,
        evitamos iterar innecesariamente */
        if (s1.length() != s2.length()) {
            System.out.println(false);
        }
        int[] charCounts = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            charCounts[s1.charAt(i) - 'a']++;
            charCounts[s2.charAt(i) - 'a']--;
        }
        for (int count : charCounts) {
            if (count != 0) {
                System.out.println(false);
            }
        }
        System.out.println(true);
    }
}
