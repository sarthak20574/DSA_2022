import java.util.*;

public class Minimum_Deletions_to_Make_String_K_Special {

    //3085. Minimum Deletions to Make String K-Special
    // https://www.youtube.com/watch?v=xF0vHgq-iEM&ab_channel=AryanMittal
    //https://leetcode.com/problems/minimum-deletions-to-make-string-k-special/description/


    int[][] dp;

    public int minimumDeletions(String word, int k) {
        Map<Character, Integer> m= new HashMap<>();

        dp= new int[26][26];

        for( int i=0; i<26; i++){
            Arrays.fill(dp[i], -1);
        }
        for( char c: word.toCharArray()){
            m.put(c, m.getOrDefault(c, 0)+1);
        }
        int ans=0;

        int n= m.size();
        List<Integer> li= new ArrayList<>(m.values());
        Collections.sort(li);

        return fn(li, 0, li.size()-1, k);
    }

    int fn(List<Integer> li, int i, int j, int k){

        if( i==j) return 0;

        if( li.get(j)-li.get(i)<=k) return 0;

        if( dp[i][j]!=-1)return dp[i][j];

        // 5- 2-0

        int ans=  li.get(i)+ fn( li, i+1, j, k);

        ans= Math.min( ans, li.get(j)-li.get(i)-k+ fn( li, i, j-1, k));

        dp[i][j]= ans;

        return ans;

    }


}
