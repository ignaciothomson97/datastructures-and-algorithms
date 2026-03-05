package cl.datastructuresandalgorithms.ValidParenthesis;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

public class ValidParenthesis {
    public static boolean validParenthesis(String s) {
        Map<Character, Character> parenthesis = Map.of(
                '(', ')',
                '[', ']',
                '{', '}'
        );

        Deque<Character> stack = new ArrayDeque<>();

        for (Character c : s.toCharArray()) {
            if (c.equals('(') || c.equals('[') || c.equals('{')) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char poppedChar = stack.pop();
                    if (parenthesis.get(poppedChar) != c) {
                        return false;
                    }
                }
            }
        }

        return stack.isEmpty();
    }
}
