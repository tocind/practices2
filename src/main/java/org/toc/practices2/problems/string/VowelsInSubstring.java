package org.toc.practices2.problems.string;

public class VowelsInSubstring {
    private static String string = "geeksforgeeks";

    public static void main(String[] args) {
        System.out.println(countQuery(string, 1, 3));
        System.out.println(countQuery(string, 2, 4));
        System.out.println(countQuery(string, 1, 9));
    }

    private static int countQuery(String s, int l, int h) {
        int count = 0;
        for (int i = l; i <= h; ++i) {
            if (isVowel(string.charAt(i))) {
                ++count;
            }
        }
        return count;
    }

    private static boolean isVowel(char k) {
        if (k == 'a' || k == 'e' || k == 'i' || k == 'o' || k == 'u' || k == 'A' || k == 'E' || k == 'I' || k == 'O' || k == 'U')
            return true;
        return false;
    }
}
