

    //1578. Minimum Time to Make Rope Colorful
    //https://leetcode.com/problems/minimum-time-to-make-rope-colorful/description/
    //

    int minCost(string colors, vector<int>& neededTime) {

            //just keep the biggest element with you and destroy(add to our cost/answer) all the other equal smaller ones

            int biggest=0,cost=0;

            for( int i=0; i<neededTime.size(); i++){

                if( i>0 && colors[i-1]!=colors[i]){
                    // if unequal then reset yhe biggest time
                    biggest=0;
                }
                cost+= min(neededTime[i], biggest);
                biggest= max(neededTime[i], biggest);
            }
            return cost;
        }
