package org.toc.practices2.binarytree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.toc.practices2.binarytree.Commons.createTree;

public class RootNodePath {

    // main function
    public static void main(String[] args) {
        TreeNode root = createTree();
        int key = 25;
        TreeNode e = isNodePresent(root, key);
    }

    // finds the path from root to a given node
    private static TreeNode isNodePresent(TreeNode root, int key) {
        if (root == null) // if root coming into the stack frame with null pointer
            return null;

        if (key == root.val){ // if root is non-null but the val is not matching

            List<TreeNode> t1 = new ArrayList<>();
            return null;
        }

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
