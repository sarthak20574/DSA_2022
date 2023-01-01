    //202. Happy Number
    //https://leetcode.com/problems/happy-number/
    // among all the one digit digits I observed that only if we get 1 or 7 then it is a      //happy no
    // so just keep adding the squares of the digits of the number when they go below
    //any stage they below 9 check if that value is 7 or 1, if yes then they are happpy      //numbers

    bool isHappy(int n)
{

    bool ans = false;

    int x;
    while (n >9)
    {
        x=0;

        while (n > 0)
        {
            int l = n % 10;
            n = n / 10;
            x += l * l;
        }
        n= x;


    }
    return (n==1 || n==7);
}


    // can be done with a hash set to see iof any of the elemnts are repating...
    //https://www.youtube.com/watch?v=gW4hSbRoQoY

// coded this after months
     public boolean isHappy(int n) {

            Set<Integer> x= new HashSet<>();

            int cur=n;
           // x. add(1);


            while( x.contains(cur)==false){
                int s=0;
                 x.add( cur);
                 //System.out.println(" cur= "+ cur);
                while(cur>0){
                    int dig= cur%10;
                    cur=cur/10;
                    s+= dig*dig;
                }
                 //System.out.println("sum = "+s);
                cur= s;
            }

           // System.out.println(cur);

            // for( int i: x){
            //     System.out.println(i);
            // }
            return cur==1;

        }