import java.util.ArrayList;
import java.util.List;

public class Compare_Version_Numbers {

    //165. Compare Version Numbers
    //https://leetcode.com/problems/compare-version-numbers/description/?envType=daily-question&envId=2024-05-03


    public int compareVersion(String v1, String v2){

        List<String> x= new ArrayList<>(List.of(v1.split("\\."))), y= new ArrayList<>(List.of(v2.split("\\.")));
        int n= Math.max(x.size(), y.size());
        while (x.size()!=n){
            x.add("0");
        }
        while (y.size()!=n){
            y.add("0");
        }

        for( int i=0; i<n; i++){
            if( Integer.parseInt(x.get(i))>Integer.parseInt(y.get(i)))
                return 1;
            else if( Integer.parseInt(x.get(i))<Integer.parseInt(y.get(i)))
                return -1;
        }
        return 0;
    }

}
