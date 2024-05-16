public class Find_the_Maximum_Sum_of_Node_Values {

    //3068. Find the Maximum Sum of Node Values
    //https://leetcode.com/problems/find-the-maximum-sum-of-node-values/
    //https://www.youtube.com/watch?v=3t7y4mBJDoM&ab_channel=AryanMittal

    public long maximumValueSum(int[] nums, int k, int[][] edges) {

        long ans=0;

        long sacri=Integer.MAX_VALUE, c=0;

        for( int i: nums){
            if((i^k)>i){
                c++;
                ans+=1L*(i^k);
                sacri= Math.min( sacri, (i^k)-i);
            }
            else{
                ans+=1L*i;
                sacri= Math.min( sacri, i-(i^k));
            }
        }

        if( c%2!=0){
            ans-=sacri;
        }

        return ans;

    }
}
