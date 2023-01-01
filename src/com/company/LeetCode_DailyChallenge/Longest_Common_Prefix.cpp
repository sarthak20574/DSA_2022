

    //14. Longest Common Prefix

    //https://leetcode.com/problems/longest-common-prefix/submissions/
    string longestCommonPrefix(vector<string>& strs) {

        string ans= strs[0];

        for( int i=1; i<strs.size(); i++){
            for( int j=0; j< ans.size(); j++){

                if( strs[i][j]!=ans[j]){
                    ans= ans.substr(0, j);
                    break;
                }
            }
        }

        return ans;
    }

     public String longestCommonPrefix(String[] s) {

            StringBuilder ans= new StringBuilder(s[0]);

            int n= s.length;

            int len_pre=0;

            for( int i=1; i<n; i++){
                 len_pre=0;
                while( len_pre<s[i].length() && len_pre<ans.length()
                        && s[i].charAt(len_pre)== ans.charAt(len_pre)){
                    len_pre++;
                }

                //for( int k=len_pre; k<ans.length();k++){

                    ans.delete(len_pre, ans.length());
                    System.out.println(ans.toString());
               // }
            }

            return ans.toString();

        }
}
