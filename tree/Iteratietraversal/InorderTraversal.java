import java.util.ArrayList; 

import java.util.*;
 

public class InorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if( root == null) return ans;
        Stack<TreeNode> st = new Stack<>();
        TreeNode node = root;
        while(node != null || !st.isEmpty()){
            st.push(node);
            node = node.left;
        }
        node = st.pop();
        ans.add(node.val);
        node = node.right;
         return ans;

    }

}
