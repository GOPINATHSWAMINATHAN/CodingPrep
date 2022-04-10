package day1.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ReverseTraversal {

    static List<List<Integer>> reverseTraversal(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();

        if (root == null)
            return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int listSize = queue.size();
            List currentList = new ArrayList(listSize);

            for (int i = 0; i < listSize; i++) {
                TreeNode currentNode = queue.poll();
                currentList.add(currentNode.val);

                if (currentNode.left != null)
                    queue.offer(currentNode.left);
                if (currentNode.right != null)
                    queue.offer(currentNode.right);
            }
            result.add(0, currentList);

        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);
        List<List<Integer>>result=reverseTraversal(root);
        System.out.println(result);
    }

}
