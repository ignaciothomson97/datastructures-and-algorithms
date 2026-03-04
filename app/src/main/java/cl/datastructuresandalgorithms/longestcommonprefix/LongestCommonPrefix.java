package cl.datastructuresandalgorithms.longestcommonprefix;

public class LongestCommonPrefix {
    public static void longestCommonPrefix(String[] strs) {
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

        System.out.println(prefix);
    }
}
