public class Path_with_Maximum_Gold {

    //1219. Path with Maximum Gold
    //https://leetcode.com/problems/path-with-maximum-gold/description/?envType=daily-question&envId=2024-05-14
    // see neetcode io's vid


    public int getMaximumGold(int[][] g) {

        int n= g.length, m= g[0].length;
        boolean[][] vis= new boolean[n][m];
        long ans=0;
        for( int i=0; i<n; i++){
            for( int j=0; j<m; j++){
                vis[i][j]=true;
                ans=Math.max(fn( i, j, g, vis), ans);
                vis[i][j]=false;
            }
        }
        return (int)ans;
    }

    long fn(int i, int j, int[][] g, boolean[][] vis){
        int n= g.length, m= g[0].length;

        int[][] dirs={{1,0}, {-1, 0}, {0,1}, {0,-1}};
        long c=0;

        for( int[] d:dirs){
            int xx= i+d[0], yy=j+d[1];

            if( xx>=0 && yy>=0 && xx<n && yy<m &&
                    vis[xx][yy]==false && g[xx][yy]!=0){
                vis[xx][yy]=true;
                c =Math.max(c, fn( xx, yy, g, vis));
                vis[xx][yy]=false;
            }
        }
        return g[i][j]+c;

    }

}
