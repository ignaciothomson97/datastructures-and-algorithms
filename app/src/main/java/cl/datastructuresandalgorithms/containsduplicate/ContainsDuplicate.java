package cl.datastructuresandalgorithms.containsduplicate;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate {
    public static void containsDuplicate() {
        int[] numbers = new int[]{1, 3, 5, 3, 7, 12, 9};

        // Tiempo cuadratico, doble iteracion sobre el mismo array (O^2)
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.print("Contains duplicate!");
                    return;
                }
            }
        }

        // Tiempo constante, pero con peor eficiencia espacial O(n)
        Map<Integer, Boolean> numbersHash = new HashMap<>();
        for (int i  = 0; i < numbers.length; i++) {
            if (!numbersHash.containsKey(numbers[i])) {
                numbersHash.put(numbers[i], true);
            } else {
                System.out.println("Contains duplicate!");
                return;
            }
        }

        // Tiempo constante, pero con mejor eficiencia espacial O(n)
        Set<Integer> seen = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            if (seen.contains(numbers[i])) {
                System.out.println("Contains duplicate!");
            } else {
                seen.add(numbers[i]);
            }
        }
    }
}
