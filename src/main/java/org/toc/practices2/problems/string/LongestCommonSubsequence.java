package org.toc.practices2.problems.string;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String s = "abcb";
        String s2 = "bdb";
        System.out.println("hello world");
        System.out.println(f(s, s2, s.length() - 1, s2.length() - 1));
    }

    private static int f(String s, String s2, int l, int l2){
        if(l == -1 || l2 == -1)
            return 0;
        else if(s.charAt(l) == s2.charAt(l2))
            return 1 + f(s, s2, l - 1, l2 - 1);
        else{
            return Math.max(f(s, s2, l - 1, l2), f(s, s2, l, l2 - 1));
        }
    }
}
