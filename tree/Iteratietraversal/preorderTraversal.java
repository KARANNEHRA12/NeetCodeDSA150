
public class preorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        if (root == null)
            return ans;

        st.push(root);
        while (!st.isEmpty()) {
            TreeNode node = st.pop();
            ans.add(node.val);
            if (node.right != null) {
                st.push(node.right);

            }
            if (node.left != null) {
                st.push(node.left);
            }
        }
        return ans;

    }
}