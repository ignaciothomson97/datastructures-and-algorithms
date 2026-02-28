package cl.datastructuresandalgorithms.validpalindrome;

public class ValidPalindrome {
    // Solucion O(N)
    public static void validPalindrome(String input) {
        int left = 0;
        int right = input.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(input.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(input.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(input.charAt(left)) != Character.toLowerCase(input.charAt(right))) {
                System.out.println("No es palindromo");
            }
            left++;
            right--;
        }
        System.out.println("Es palindromo");
    }
}
