/*
Given the roots of two binary trees p and q, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
 */

import TreeNode.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

import static TreeNode.TreeNode.createBinaryTree;

public class $100_Same_Tree {

    public static void main(String[] args) {
        int[] values = {1, 2, 3};
        int[] values_2 = {1, 2, 3};
        TreeNode root = createBinaryTree(values);
        TreeNode root_2 = createBinaryTree(values);
        System.out.println(isSameTree(root_2, root));
    }


    public static boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null) return true;
        if (p == null || q == null) return false;

        Queue<TreeNode> firstQueue = new LinkedList<TreeNode>();
        Queue<TreeNode> secondQueue = new LinkedList<TreeNode>();

        firstQueue.offer(p);
        secondQueue.offer(q);

        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
            TreeNode currentFirstQueueNode = firstQueue.poll();
            TreeNode currentSecondQueueNode = secondQueue.poll();


            if (currentFirstQueueNode.val != currentSecondQueueNode.val) return false;

            if (currentFirstQueueNode.left != null && currentSecondQueueNode.left != null) {
                firstQueue.offer(currentFirstQueueNode.left);
                secondQueue.offer(currentSecondQueueNode.left);
            } else if (currentFirstQueueNode.left != null || currentSecondQueueNode.left != null) {
                return false;
            }

            if (currentFirstQueueNode.right != null && currentSecondQueueNode.right != null) {
                firstQueue.offer(currentFirstQueueNode.right);
                secondQueue.offer(currentSecondQueueNode.right);
            } else if (currentFirstQueueNode.right != null || currentSecondQueueNode.right != null) {
                return false;
            }
        }

        return firstQueue.isEmpty() && secondQueue.isEmpty();

    }
}