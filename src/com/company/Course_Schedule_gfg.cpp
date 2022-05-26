

 //https://practice.geeksforgeeks.org/problems/course-schedule/1
    //

    /*
    if a course x is needed for course y, then an directed arrow from  x to y

    the courses with 0 incoming edge degrees can be done without any pre requisites
     and push these to the queue ( the queue contains all courses
     with no remaining prerequisites)

     for every course in queue( these will be having in degree as 0) add to the answer, those courses
      having it as the  prerequisite decrement the in degrees by 1

      if the new degree is 0 then it means that that task can be done
     */


    //or can use topological sort

    vector<int> findOrder(int n, int m, vector<vector<int>> pre)
    {
        queue<int> q;

        vector<vector<int>> pre_graph(n);
        vector<int> in_degrees(n), ans;

        for( auto &x:pre){
        //2nd part are all the courses for which this course is a
        //pre requisites
        pre_graph[x[1]].push_back(x[0]);
        in_degrees[x[0]]++;
    }

        for( int i=0; i<n; i++){
            if( in_degrees[i]==0) q.push(i);
        }


        while(q.size()>0){ // just q.size()

            int cur= q.front();
            q.pop();

            for( auto &neighbour: pre_graph[cur]){
                in_degrees[neighbour]--;
                if( in_degrees[neighbour]==0) q.push(neighbour);

            }
            ans.push_back(cur);
        }

        if( ans.size()!=n){
            return vector<int>();//empty vector
        }
        else{
            return ans;
        }
    }