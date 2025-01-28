import TreeNode.TreeNode;

import java.util.Stack;

import static TreeNode.TreeNode.createBinaryTree;

public class $1038_Binary_Search_Tree_To_Greater_Sum_Tree {
    public static void main(String[] args) {

        int[] values = {4, 1, 6, 0, 2, 5, 7, 3, 8};
        TreeNode root = createBinaryTree(values);

        bstToGst(root);

    }


    public static TreeNode bstToGst(TreeNode root) {
        int sum = 0;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (!stack.isEmpty() || current != null) {
            // Собираем все что есть справа в стэк
            while (current != null) {
                stack.push(current);
                current = current.right;
            }

            current = stack.pop();

            // Обновляем накопленную сумму и значение узла
            sum += current.val;
            current.val = sum;

            /* Смотрим есть ли узел слева от текущего узла, если есть,
            то он тоже попадет в стэк и у него тоже соберем все правые узлы
            */
            current = current.left;
        }
        return root;
    }
}
