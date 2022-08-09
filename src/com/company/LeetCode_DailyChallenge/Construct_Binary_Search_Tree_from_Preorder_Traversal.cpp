//1008. Construct Binary Search Tree from Preorder Traversal
//https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/
//https://www.youtube.com/watch?v=9sw8RRsBw6s&ab_channel=TECHDOSE

struct TreeNode {
     int val;
      TreeNode *left;
      TreeNode *right;
      TreeNode() : val(0), left(nullptr), right(nullptr) {}
      TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
      TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
  };


//
TreeNode* bstFromPreorder(vector<int>& pre) {

        int n= pre.size();
        if( n==0) return NULL;

        // preorder traversal's first element is always thwe root
        TreeNode* root= new TreeNode(pre[0]);

        // initially we can use - infinity to + infinity as the range
        fn( pre, 1, root,INT_MIN, INT_MAX, n);
        return root;

        }

        int fn( vector<int> &pre, int pos,TreeNode *root,int minn, int maxx, int n){

        // if already processed all the values in the preorder array, then we will return , or if the current element is not in the range then too we will return
        if( pos==n || pre[pos]<minn || pre[pos]>maxx) return pos;

        // it lies in the left tree, if its val is less than the root's value
        if( pre[pos]<root->val){
        root->left= new TreeNode(pre[pos]);
        pos++;

        //now root's val-1 becomes our maxx
        pos= fn( pre, pos, root->left, minn, root->val-1,n);
        }

        // after creating the left subtree, we would have inserted some elements and changed our position, so check the base case again
        if( pos==n || pre[pos]<minn || pre[pos]>maxx) return pos;

        // if can't put it in the left, but the element is in the range min-max then have to put it in the right tree

        root->right=new TreeNode(pre[pos]);
        pos++;

        //now root's val+1 becomes our mainn
        pos=fn( pre, pos, root->right, root->val+1, maxx,n);

        return pos;
        }