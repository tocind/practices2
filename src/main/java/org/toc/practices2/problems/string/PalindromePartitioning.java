package org.toc.practices2.problems.string;

public class PalindromePartitioning {
    public static void main(String[] args) {
        String s = "banana";
        boolean[][] m = new boolean[6][6];
        f(s, m);
        print(m);
    }

    private static void f(String s, boolean[][] m) {
        for (int i = 0; i < s.length(); ++i) {
            m[i][i] = true;
        }
        for (int i = 0; i < s.length() - 1; ++i) {
            if (s.charAt(i) == s.charAt(i + 1))
                m[i][i + 1] = true;
        }
        int v = 2;
        for (int i = 0; i < m.length - v; ++i) {
            for (int j = v; j < m.length; ++j) {
                System.out.print(i+" "+j+",");
                if(s.charAt(i) == s.charAt(j) &&
                        m[i + 1][j - 1] == true){
                    m[i][j] = true;
                }
            }
            ++v;
            System.out.println();
        }
    }

    private static void print(boolean[][] m) {
        for (int i = 0; i < m.length; ++i) {
            for (int j = 0; j < m.length; ++j) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

    }
}
