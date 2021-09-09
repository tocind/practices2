package org.toc.practices2.binarytree;

import static org.toc.practices2.binarytree.Commons.createTree;

public class FindNode {
    public static void main(String[] args) {

        TreeNode root = createTree();
        int key = 25;
        TreeNode e = isNodePresent(root, key);
    }

    // function to find if node is present in the tree or not
    private static TreeNode isNodePresent(TreeNode root, int key) {

        if(root == null) // if root coming into the stack frame with null pointer
            return null;

        if (key == root.val) // if root is non-null but the val is not matching
            return root;

        TreeNode leftTree = isNodePresent(root.left, key);
        TreeNode rightTree = isNodePresent(root.right, key);

        if(leftTree == null && rightTree == null)
            return null;
        else if(leftTree == null)
            return rightTree;
        else
            return leftTree;

    }
}
