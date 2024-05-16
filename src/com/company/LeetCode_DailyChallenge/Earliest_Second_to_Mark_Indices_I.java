import java.util.HashMap;
import java.util.Map;

public class Earliest_Second_to_Mark_Indices_I {

    //3048. Earliest Second to Mark Indices I
    //https://leetcode.com/problems/earliest-second-to-mark-indices-i/
    // https://www.youtube.com/watch?v=vFpahT0W3IQ&ab_channel=AryanMittal

    public int earliestSecondToMarkIndices(int[] nums, int[] ch) {
        int n=ch.length, ans=n, beg=0, end=n-1,mid=0;
        for( int i=0; i<n; i++){
            ch[i]--;
        }

        while( beg<=end){
            mid= beg+(end-beg)/2;

            if( fn(nums, ch, mid)){
                ans= mid;
                end= mid-1;
            }
            else{
                beg= mid+1;
            }
        }


        return ans==n?-1:ans+1;
    }

    boolean fn(int[] nums, int[] ch, int maxx){

        Map<Integer, Integer> m= new HashMap<>(), ts= new HashMap<>();

        for( int i=0; i<=maxx; i++){
            m.put( ch[i], i);
        }

        int left=0, n= nums.length;

        for( int i=0; i<=maxx; i++){

            // ts.put(ch[i], m.getOrDefault(ch[i], 0L)+1L);
            if(m.get(ch[i])==i){
                if( left>=nums[ch[i]] ){
                    left-= (nums[ch[i]] );
                    n--;
                    m.remove(ch[i]);
                }
                else{
                    return false;
                }
            }
            else{
                left++;
            }
        }

        return n==0;
    }
}
