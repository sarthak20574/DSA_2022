//968. Binary Tree Cameras
//https://leetcode.com/problems/binary-tree-cameras/
//https://www.youtube.com/watch?v=fORHMo5yzNk

struct TreeNode {
      int val;
      TreeNode *left;
      TreeNode *right;
      TreeNode() : val(0), left(nullptr), right(nullptr) {}
      TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
      TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
  };


 // if parent's child provides....the parent ok
    // else if the child needs parent has to provide
    // else parent want

    // base case if root == want we need to give it one

    //

    int ans=0;
    int minCameraCover(TreeNode* root) {

        if(fn( root)=="want") ans++;
        return ans;
    }

    string fn( TreeNode* root){

        if( root== NULL){
            return "ok";
        }
        // get inpuuts from the right and the left child

        string lft= fn( root->left);
        string ryt= fn(root->right);

        if( ryt=="want" || lft=="want"){
            ans++;
            return "provide";
        }
        else if( ryt=="provide" || lft=="provide"){
            return "ok";
        }
        else{
            return "want";
        }
    }
