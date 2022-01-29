package com.company;

public class indexOfTheExtraElement {

    public int findExtra(int a[], int b[], int n) {
        int index = n-1;

        // left and right are end
        // points denoting the current range.
        int left = 0, right = n - 2;
        while (left <= right)
        {
            int mid = (left+right) / 2;

            // If middle element is same
            // of both arrays, it means
            // that extra element is after
            // mid so we update left to mid+1
            if (b[mid] == a[mid])
                left = mid + 1;

                // If middle element is different
                // of the arrays, it means that
                // the index we are searching for
                // is either mid, or before mid.
                // Hence we update right to mid-1.
            else
            {
                index = mid;
                right = mid - 1;
            }
        }

        // when right is greater than
        // left, our search is complete.
        return index;
    }

    //
    public int findExtra1(int a[], int b[], int n) {

        int low=0, high=n-1, mid, index=-1;

        while (low<=high){
            mid= (low+high)/2;

            //if the extra element is not found anywhere else then the last place to find is in the
            // last element but that is not present in 2nd small array so that must be the
            // distinct element
            if( mid==n-1){
                index=n-1;
                break;
            }

            if( a[mid]==b[mid]){
                low= mid+1;
            }
            else {
                high= mid -1;
                index= mid;
            }
        }

        return index;

    }

    int convertfive(int num) {
        String a= ""+num, ans="";
        for( int i =0;i<a.length();i++){
            if(a.charAt(i)=='0') ans+="5";
            else ans+=a.charAt(i);
        }
        return Integer.parseInt(ans);
    }

}
