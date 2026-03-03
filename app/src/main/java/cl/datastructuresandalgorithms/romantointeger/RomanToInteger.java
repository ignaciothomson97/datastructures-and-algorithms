package cl.datastructuresandalgorithms.romantointeger;

import java.util.Map;

public class RomanToInteger {
    public static void romanToInteger(String s) {
        Map<Character, Integer> values = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );

        int result = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            int currentValue = values.get(s.charAt(i));
            int nextValue = values.get(s.charAt(i + 1));

            if (currentValue < nextValue) {
                result = result - currentValue;
            } else {
                result = result + currentValue;
            }
        }

        result = result + values.get(s.charAt(s.length() - 1));
        System.out.println("Result: " + result);
    }
}
