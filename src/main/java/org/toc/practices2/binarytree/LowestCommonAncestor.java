package org.toc.practices2.binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static org.toc.practices2.binarytree.Commons.createTree;

public class LowestCommonAncestor {

    public static void main(String[] args) {
        TreeNode root = createTree();
        printInorder(root);
        int key = 0;
        Stack<TreeNode> path = findPath(root, key);
        processArray(path);
    }

    private static void processArray(Stack<TreeNode> path) {
        while (!path.empty()) {
            System.out.print(path.pop() + " ");
        }

    }

    private static void printInorder(TreeNode root) {
        if (root == null)
            return;

        printInorder(root.left);
        System.out.println(root.val);
        printInorder(root.right);
    }

    private static Stack<TreeNode> findPath2(TreeNode root, int key){ // This is recursive approach ...
        return null;
    }

    private static Stack<TreeNode> findPath(TreeNode root, int key) {
        List<TreeNode> visited = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        visited.add(root);
        while (!stack.empty()) {
            TreeNode e = stack.peek();
            if (e.val == key)
                return stack;
            else {
                if(e.left != null && e.right == null && !visited.contains(e.left)) {
                    stack.push(e.left);
                    visited.add(e.left);
                }

                else if(e.left == null && e.right != null && !visited.contains(e.right)){
                    stack.push(e.right);
                    visited.add(e.right);
                }
                else if(e.left != null && !visited.contains(e.left)){
                    stack.push(e.left);
                    visited.add(e.left);
                }
                else if(e.right != null && !visited.contains(e.right)){
                    stack.push(e.right);
                    visited.add(e.right);
                }

                if(e.left == null && e.right == null) {
                        stack.pop();
                }
                else if(visited.contains(e)){
                    stack.pop();
                }
            }

        }
        return null;
    }

}
