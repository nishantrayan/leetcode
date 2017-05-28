import java.util.LinkedList;


public class Solution513 {
  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }

  public int findBottomLeftValue(TreeNode root) {
    LinkedList<TreeNode> levelNodes = new LinkedList<>();
    levelNodes.add(root);
    levelNodes.add(null);
    int leftMost = root.val;
    while (!levelNodes.isEmpty()) {
      TreeNode first = levelNodes.removeFirst();
      if (first == null) {
        if (!levelNodes.isEmpty()) {
          first = levelNodes.removeFirst();
          leftMost = first.val;
          levelNodes.add(null);
        }
      }
      if (first != null) {
        if (first.left != null) {
          levelNodes.add(first.left);
        }
        if (first.right != null) {
          levelNodes.add(first.right);
        }
      }
    }
    return leftMost;
  }
}
