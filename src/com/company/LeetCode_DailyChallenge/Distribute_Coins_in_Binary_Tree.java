import com.company.LeetCode_DailyChallenge.TreeNode;

public class Distribute_Coins_in_Binary_Tree {

    //979. Distribute Coins in Binary Tree

    //https://leetcode.com/problems/distribute-coins-in-binary-tree/?envType=daily-question&envId=2024-05-18
    //https://www.youtube.com/watch?v=YfdfIOeV_RU&list=PPSV&ab_channel=NeetCodeIO

    int ans=0;
    public int distributeCoins(TreeNode root) {

        fn(root);
        return ans;
    }

    int[] fn( TreeNode r){

        if( r==null) return new int[]{0,0};

        int[] x=fn(r.left);
        int[] y=fn(r.right);

        int nod=x[0]+y[0]+1, coi=x[1]+y[1]+r.val;
        ans+=( Math.abs( coi-nod));

        return new int[]{nod, coi};
    }

}
