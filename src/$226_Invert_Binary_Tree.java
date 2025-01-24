/*
Given the root of a binary tree, invert the tree, and return its root.
 */
import TreeNode.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

import static TreeNode.TreeNode.createBinaryTree;

public class $226_Invert_Binary_Tree {

    public static void main(String[] args) {

        int[] values = {4, 2, 7, 1, 3, 6, 9};
        int[] values_2 = {};
        TreeNode root = createBinaryTree(values);
        TreeNode root_2 = createBinaryTree(values_2);
        System.out.println(invertTree(root));
        System.out.println(invertTree(root_2));

    }

    public static TreeNode invertTree(TreeNode root) {

        if (null == root) return null;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);

        while (!queue.isEmpty()){

            TreeNode currentNode = queue.poll();
            TreeNode tempNode;

            if (currentNode.left != null && currentNode.right != null) {

                queue.offer(currentNode.left);
                queue.offer(currentNode.right);
                tempNode = currentNode.left;

                currentNode.left = currentNode.right;
                currentNode.right = tempNode;

            } else if (currentNode.left != null) {
                queue.offer(currentNode.left);
                currentNode.right = currentNode.left;
                currentNode.left = null;
            } else if (currentNode.right != null) {
                queue.offer(currentNode.right);
                currentNode.left = currentNode.right;
                currentNode.right = null;
            }
        }
        return root;
    }
}
