 //820. Short Encoding of Words
    //https://leetcode.com/problems/short-encoding-of-words/
    //https://www.youtube.com/watch?v=6f0pLQYG834

   int minimumLengthEncoding(vector<string>& words) {

        // insert all the elements in a hash set
        unordered_set<string> x2(words.begin(), words.end());


        // get all the substrings from the given vector and delete all the substrings in the hashset.
        for( auto x: words){

            // starting from 1 becasue we don't want to remove the entire string....
            //if both sets have the word 'lime' then "lime".substr(0)  gives lime and deletes the whole word line from the second set

            // but we want it to check for "ime", "me", "e"
            for( int i=1; i< x.size(); i++){

                x2.erase(x.substr(i));
            }
        }

        // now add the length of the remaining words and add 1 to it becasuse of the # present

        int ans=0;
       cout<< x2.size();
        for( auto x: x2){
            cout<<ans;
            ans+= x.size()+1;
        }
        return ans;

    }
