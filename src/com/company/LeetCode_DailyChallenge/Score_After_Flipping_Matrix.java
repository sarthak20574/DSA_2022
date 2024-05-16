public class Score_After_Flipping_Matrix {

    //861. Score After Flipping Matrix
    //https://leetcode.com/problems/score-after-flipping-matrix/description/?envType=daily-question&envId=2024-05-13
    // see neetcode's vid
    public int matrixScore(int[][] g) {
        int n= g.length, m=g[0].length;

        for( int i=0; i<n; i++){
            if( g[i][0]==0){
                for( int j=0; j<m; j++){
                    g[i][j]=(g[i][j]==0?1:0);
                }
            }
        }

        long cur=1, ans=0;

        for(int j=m-1; j>=0; j--){
            long ones=0;
            for(int i=0; i<n; i++){
                ones+=(g[i][j]==1?1:0);
            }

            ones= Math.max( n-ones, ones);
            ans+= cur*ones;
            cur*=2;
        }

        return (int)ans;
    }
}
