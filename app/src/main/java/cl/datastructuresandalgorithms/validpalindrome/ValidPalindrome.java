package cl.datastructuresandalgorithms.validpalindrome;

public class ValidPalindrome {
    // Solucion O(N)
    public static void validPalindrome(String input) {
        int left = 0;
        int right = input.length() - 1;
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                System.out.println("No es palindromo");
            }
            left++;
            right--;
        }
        System.out.println("Es palindromo");
    }
}
