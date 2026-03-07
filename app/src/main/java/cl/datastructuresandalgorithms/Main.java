package cl.datastructuresandalgorithms;

import cl.datastructuresandalgorithms.searchinsertposition.SearchInsertPosition;

public class Main {
    public static void main(String[] args) {
        /*
        ContainsDuplicate.containsDuplicate(new int[]{1, 3, 5, 3, 7, 12, 9});
        ValidAnagram.validAnagram("bat", "tab");
        TwoSum.twoSum(new int[]{2, 7, 11, 15}, 9);
        AnagramGroup.anagramGroup(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        ValidPalindrome.validPalindrome("A man, a plan, a canal: Panama");
        MoveZeroes.moveZeroes(new int[]{0, 1, 0, 3, 12});
        RemoveDuplicates.removeDuplicates(new int[]{1, 1, 1, 2, 2, 2, 3, 3, 3, 4});
        RomanToInteger.romanToInteger("MCMXCIV");
        LongestCommonPrefix.longestCommonPrefix(new String[]{"flower","flow","flight"});
        ValidParenthesis.validParenthesis("([)]");
        StringFirstIndexOcurrence.stringFirstIndexOcurrence("sadbutsad", "sad");
        */

        System.out.println(SearchInsertPosition.searchInsertPosition(new int[]{1, 3, 5, 9}, 7));

        /*
         Extras
        ReverseArray.reverseArray(new String[]{"Hello", "There", "Strange", "Beautiful", "World"});
        FirstNonRepeatedCharacter.firstNonRepeatedCharacter("leetcoder");
        ArrayIntersection.arrayIntersection(new int[]{4, 5, 9}, new int[]{4, 4, 8, 9, 9});
        SortedSquaredArray.sortedSquaredArray(new int[]{-4, -1, 0, 3, 4, 10});
        ReverseVowels.reverseVowels("IceCreAm");
        */
    }
}