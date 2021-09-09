package org.toc.practices2.problems.string;

public class StringSubsequence {

    public static void main(String[] args) {

        String str = "abcd";
        String sub = getSubsequences(str);
        System.out.println(sub);
        System.out.println(sub.split(",").length);
    }

    public static String getSubsequences(String str) {

        Stack stack = new StringSubsequence().new Stack();
        int i = 0;
        String sub = "";
        String base = "";
        stack.push(-1, "");
        do {
            if (i < str.length() - 1) {
                base = base + str.charAt(i);
                if (i == 0) {
                    sub += base;
                } else {
                    sub += ", " + base;
                }
                stack.push(i, base);
                i++;
            } else {
                if (i == 0) {
                    sub = "" + str.charAt(i);
                } else {
                    sub += ", " + base + str.charAt(i);
                }
                i = stack.peek() + 1;
                stack.pop();
                if (stack.getTopNode() != null) {
                    base = stack.peekBase();
                }
            }
        } while (stack.getTopNode() != null);

        return sub;
    }

    private class Stack {

        private class Node {
            private int index;
            private String base;
            private Node next;
        }

        private Node top;

        public void push(int index, String base) {
            Node temp = new Node();
            temp.index = index;
            temp.base = base;

            temp.next = top;
            top = temp;
        }

        public int pop() {
            if (top == null) {
                throw new RuntimeException("Stack Underflow");
            }
            int idx = top.index;
            Node temp = top;
            top = top.next;
            temp.next = null;

            return idx;
        }

        public Node getTopNode() {
            return top;
        }

        public int peek() {
            if (top == null) {
                throw new RuntimeException("Stack Underflow");
            }

            return top.index;
        }

        public String peekBase() {
            if (top == null) {
                throw new RuntimeException("Stack Underflow");
            }

            return top.base;
        }
    }
}


