public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { 
      val = x;
      }
  }
public class DCP {

 public String serialize(TreeNode root) {
    StringBuilder sb = new StringBuilder();
    serializeHelper(root, sb);
    String result = sb.toString();
    return result.substring(0, result.length() - 1);
}

public void serializeHelper(TreeNode root, StringBuilder result) {
    if (root == null) {
        result.append("null,");
        return;
    }
    result.append(root.val + ",");
    serializeHelper(root.left, result);
    serializeHelper(root.right, result);
}
// Decodes your encoded data to tree.
public TreeNode deserialize(String data) {
    return deserializeHelper(data.split(","));
}
int index = 0;
public TreeNode deserializeHelper(String[] data) {
    if (index >= data.length || data[index].equals("null")) {
        return null;
    }
    TreeNode curr = new TreeNode(Integer.valueOf(data[index]));
    index++;
    curr.left = deserializeHelper(data);
    index++;
    curr.right = deserializeHelper(data);
    return curr;
}
}
