package cl.datastructuresandalgorithms.extras;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
    public static void firstNonRepeatedCharacter(String s) {
        Map<Character, Integer> frequenceMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            frequenceMap.put(s.charAt(i), frequenceMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        boolean found = false;

        for (int i = 0; i < s.length(); i++) {
            if (frequenceMap.get(s.charAt(i)) == 1) {
                System.out.println("I: " + i);
                found = true;
                break;
            }
        }

        if (!found) System.out.println("-1");
    }
}

