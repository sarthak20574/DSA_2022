import java.util.*;

public class Replace_Question_Marks_in_String_to_Minimize_Its_Value {

    //3081. Replace Question Marks in String to Minimize Its Value
    // see aryan mittal's cideo
    //https://leetcode.com/problems/replace-question-marks-in-string-to-minimize-its-value/

    public String minimizeStringValue(String s) {
        int q=0;

        int[] cur= new int[26];

        int n= s.length();
        for( int i=0; i<n; i++){

            if( s.charAt(i)=='?'){
                q++;
            }
            else {
                cur[s.charAt(i)-'a']++;
            }
        }

        Queue<int[]>
                pq= new PriorityQueue<>((a, b)->a[1]==b[1]?
                a[0]-b[0]:a[1]-b[1]);

        for( int i=0; i<26; i++){
            pq.add(new int[]{i, cur[i]});
        }

        List<Integer> li= new ArrayList<>();

        for( int i=0; i<q; i++){

            int[] x=pq.poll();
            li.add( x[0]);
            pq.add( new int[]{x[0], x[1]+1});
        }

        Collections.sort(li);

        StringBuilder ans= new StringBuilder();

        // int cur=0;

        for( int i=0; i<n; i++){

            if( s.charAt(i)=='?'){
                ans.append((char)('a'+li.remove(0)));
            }
            else {
                ans.append(s.charAt(i));
            }
        }

        return ans.toString();
    }

}
