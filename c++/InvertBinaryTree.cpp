/* 
Invert a binary tree.
Example Input:

     4
   /   \
  2     7
 / \   / \
1   3 6   9

Example Output:

     4
   /   \
  7     2
 / \   / \
9   6 3   1

*/
struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
};

class InvertBinaryTree {
public:
    TreeNode* invertTree(TreeNode* root) {
        if (root == nullptr) {
            return root;
        }
        
        TreeNode* tempRoot = root->left;
        root->left = root->right;
        root->right = tempRoot;
        invertTree(root->left);
        invertTree(root->right);
        
        return root;
    }
};