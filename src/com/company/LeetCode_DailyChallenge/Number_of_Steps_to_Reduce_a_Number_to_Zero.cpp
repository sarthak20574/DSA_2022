 //1342. Number of Steps to Reduce a Number to Zero
//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
//https://www.youtube.com/watch?v=iVd7KWccHYQ

 int numberOfSteps(int num) {

        int ans=0;
        while( num){//greater than 0
            if( num%2==0)num= num/2;

            else num--;

            ans++;
        }

        return ans;
    }


    //using bit manipulation

     int numberOfSteps(int num) {

            int ans=0;
            while( num){//greater than 0
                if( (num & 1)==0)num= num>>1; //and 1(0001) is 1 for odd and 0 for even

                //if( (num & 1)==0) is not equal to if (num & 1==0) & has less precedence

                else num--;

                ans++;
            }

            return ans;
        }