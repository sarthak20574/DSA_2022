import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Find_the_Safest_Path_in_a_Grid {

    //2812. Find the Safest Path in a Grid
    //https://leetcode.com/problems/find-the-safest-path-in-a-grid/description/?envType=daily-question&envId=2024-05-15
    //see neetcode IO's vid

    public int maximumSafenessFactor(List<List<Integer>> g) {

        int n= g.size(), m= g.get(0).size();

        Queue<int[]> q= new LinkedList<>();

        // List<String> vis= new ArrayList<>();
        boolean[][] vis= new boolean[n][m];

        for( int i=0; i<n; i++){

            for( int j=0; j<m ; j++){

                if( g.get(i).get(j)==1){
                    q.add(new int[]{i, j});
                    g.get(i).set(j, 0);
                    vis[i][j]=true;

                }
            }
        }

        int dis=0;
        //  System.out.println(q.size());

        int[][] dirs= {{0,1},{1,0},{-1, 0},{0, -1}};

        while( q.isEmpty()==false){

            int len=q.size();
            //  System.out.println(q.size());
            dis++;

            for( int i=0; i<len; i++){
                int[] cur= q.poll();

                for( int[] d: dirs){
                    int xx= cur[0]+d[0], yy= cur[1]+d[1];


                    if( xx>=0 && xx<n && yy>=0 && yy<m &&
                            vis[xx][yy]==false){
                        g.get(xx).set( yy, dis);
                        vis[xx][yy]=true;
                        q.add( new int[]{xx, yy});
                    }
                }
            }
        }

        // System.out.println(g);


        Queue<int[]> pq= new PriorityQueue<>((a, b)->b[0]-a[0]);
        pq.add( new int[]{g.get(0).get(0),0,0});
        vis= new boolean[n][m];
        vis[0][0]= true;


        while( pq.isEmpty()==false){
            int[] cur= pq.poll();
            if( cur[1]==n-1 && cur[2]==m-1) return cur[0];

            for( int[] d: dirs){
                int xx=d[0]+cur[1], yy= d[1]+cur[2];

                if(xx>=0 && yy>=0 && xx<n && yy<m
                        && vis[xx][yy]==false){
                    vis[xx][yy]=true;
                    pq.add(new int[]{
                            Math.min(cur[0],g.get(xx).get(yy)),xx, yy});
                }
            }
        }
        return -1;
    }

}
