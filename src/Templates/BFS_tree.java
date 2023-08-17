package Templates;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left,TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class BFS_tree {




    public List<List<Integer>> levelOrder(TreeNode root) {


        List<List<Integer>> ans= new ArrayList<>();

        Queue<TreeNode> q= new LinkedList<>();

        if( root==null) return ans;
        q.add(root);

        while( q.size()!=0){
            List<Integer> x= new ArrayList<>();

            // q.size() is changing inside the loop so pre calculate it
            int n=q.size();

            for( int i=0; i< n; i++){

                TreeNode aa= q.poll();
                x.add( aa.val);

                if(aa.left!=null)q.add(aa.left);
                if(aa.right!=null)q.add(aa.right);
            }

            ans.add(x);
        }

        return ans;
    }

}
