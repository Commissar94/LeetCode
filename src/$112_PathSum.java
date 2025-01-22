/*
Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.

A leaf is a node with no children.
 */

import java.util.LinkedList;
import java.util.Queue;

public class $112_PathSum {

    public static void main(String[] args) {

        System.out.println(hasPathSum(createTree(),22));
    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {

        if (root == null) return false;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

            if (current.left == null && current.right == null) {
                if (current.val == targetSum) {
                    return true;
                }
            }

            if (current.left != null) {
                current.left.val += current.val;
                queue.add(current.left);
            }
            if (current.right != null) {
                current.right.val += current.val;
                queue.add(current.right);
            }
        }
        return false;
    }


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static TreeNode createTree() {
        // Листья
        TreeNode node7 = new TreeNode(7);
        TreeNode node2 = new TreeNode(2);
        TreeNode node1 = new TreeNode(1);

        // Уровень выше
        TreeNode node11 = new TreeNode(11, node7, node2);
        TreeNode node13 = new TreeNode(13);
        TreeNode node4Right = new TreeNode(4, null, node1);

        // Ещё уровень выше
        TreeNode node4Left = new TreeNode(4, node11, null);
        TreeNode node8 = new TreeNode(8, node13, node4Right);

        // Корень
        TreeNode root = new TreeNode(5, node4Left, node8);

        return root;
    }
}

