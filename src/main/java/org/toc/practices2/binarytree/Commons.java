package org.toc.practices2.binarytree;

import java.util.Stack;

public class Commons {
    public static void processStack(Stack<TreeNode> path) {
        while (!path.empty()) {
            System.out.print(path.pop() + " ");
        }
    }

    public static void printInorder(TreeNode root) {
        if (root == null)
            return;

        printInorder(root.left);
        System.out.println(root.val);
        printInorder(root.right);
    }

    public  static TreeNode createTree() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(0);
        root.right.left.right = new TreeNode(9);
        root.right.right = new TreeNode(8);

        return root;
    }
}
