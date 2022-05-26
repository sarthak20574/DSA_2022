
//Even and Odd gfg POTD
//https://practice.geeksforgeeks.org/problems/even-and-odd/1

 void reArrange(int arr[], int N) {
        int eve=0, odd=1;

        while( eve<N && eve<N){

            while( eve<N && arr[eve]%2==0)eve+=2;

            while(odd<N && arr[odd]%2!=0) odd+=2;

            if( eve<N && odd<N) swap(arr[eve], arr[odd]);

        }

    }