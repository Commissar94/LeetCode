/*
Given the root of a binary tree, return the sum of values of its deepest leaves.


Example 1:

Input: root = [1,2,3,4,5,null,6,7,null,null,null,null,8]
Output: 15
 */

import java.util.LinkedList;
import java.util.Queue;

import TreeNode.TreeNode;

public class $1302_Deepest_Leaves_Sum {

    public static void main(String[] args) {

        System.out.println(deepestLeavesSum(createSpecificTree()));
    }


    public static int deepestLeavesSum(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList();

        queue.add(root);
        int sum = 0;
        int level = 0;
        int levelCheck = 0;

        while (!queue.isEmpty()) {
            level++;
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();

                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }

                if (levelCheck < level) sum = 0;

                if (currentNode.left == null && currentNode.right == null){
                    sum += currentNode.val;
                    levelCheck = level;
                }
            }

        }
        return sum;
    }


    public static TreeNode createSpecificTree() {
        // Уровень 1
        TreeNode root = new TreeNode(1);

        // Уровень 2
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        // Уровень 3
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        // Уровень 4
        root.left.left.left = new TreeNode(7);
        root.right.right.right = new TreeNode(8);

        return root;
    }

}
