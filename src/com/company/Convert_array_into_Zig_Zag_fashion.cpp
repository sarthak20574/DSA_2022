

    //Convert array into Zig-Zag fashion
    //https://practice.geeksforgeeks.org/problems/convert-array-into-zig-zag-fashion1638/1

    void zigZag(int arr[], int n) {
        int i=0;
        while( i<n-1 ){
            if( i%2==0){
                if( arr[i]> arr[i+1]) swap(arr[i], arr[i+1]);
            }
            else {
                if( arr[i]< arr[i+1]) swap(arr[i], arr[i+1]);

            }
            i++;
        }

    }


