package cl.datastructuresandalgorithms.lengthoflastword;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
//        String[] splittedWords = s.split(" ");
//        return splittedWords[splittedWords.length - 1].length();
        s = s.trim();

        int length = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            } else if (length > 0) {
                break;
            }
        }

        return length;
    }
}
