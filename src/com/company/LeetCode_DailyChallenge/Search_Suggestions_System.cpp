
    //1268. Search Suggestions System
    //https://www.youtube.com/watch?v=D4T2N0yAr20
    //https://leetcode.com/problems/search-suggestions-system/
    vector<vector<string>> suggestedProducts(vector<string>& products, string searchWord) {

        vector<vector<string>> ans;

        sort(products.begin(), products.end());

        int n= searchWord.size();
        int top= 0, base= products.size()-1;

        for( int i=0; i< n; i++){

            while( top<= base && (i>= products[top].size() || products[top][i]<searchWord[i])) top++;

            while( top<= base && (i>= products[base].size() || products[base][i]> searchWord[i])) base--;

            ans.push_back({});

            for (int j = top; j < min(top + 3, base + 1); j++)
                ans.back().push_back(products[j]);

        }
        return ans;
    }