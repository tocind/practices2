package org.toc.practices2.problems.string;

public class StringSubsequenceRecursion {

    public static void main(String[] args) {

        String str = "abcde";
        String sub = getSubsequences(str, 0, str.length() - 1, "", "");
        System.out.println(sub);
        System.out.println(sub.split(",").length);

    }

    public static String getSubsequences(String str, int start, int end, String sub, String base) {
        String nextBase;
        for (int i = start; i <= end; i++) {
            nextBase = base + str.charAt(i);
            if (i == 0) {
                sub = nextBase;
            } else {
                sub = sub + ", " + nextBase;
            }
            sub = getSubsequences(str, i + 1, end, sub, nextBase);
        }

        return sub;
    }
}
