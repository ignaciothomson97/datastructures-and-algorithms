package cl.datastructuresandalgorithms.extras;

public class ReverseVowels {
    public static void reverseVowels(String word) {
        String vowels = "aeiouAEIOU";
        char[] chars = word.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            // Debemos añadir esta validación (left < right) en los while internos, para la protección de límites
            while (left < right && vowels.indexOf(chars[left]) == -1) {
                left++;
            }
            while (left < right && vowels.indexOf(chars[right]) == -1) {
                right--;
            }
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        System.out.println("Word: " + String.valueOf(chars));
    }
}
