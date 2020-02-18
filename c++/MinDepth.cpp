/*
Given a binary tree, find its minimum depth.
The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
*/
#include <algorithm>  

struct TreeNode
{
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
};

class MinDepth {
public:
    int minDepth(TreeNode* root) {
         if (root == nullptr) {
            return 0;
        }
        
        if (root->left == nullptr && root->right == nullptr) {
            return 1;
        }
        
        if (!root->left) {
            return 1 + minDepth(root->right);
        }
        else if (!root->right) {
            return 1 + minDepth(root->left);
        }
        else {
            return std::min(minDepth(root->right),minDepth(root->left)) + 1;
        }
    }
};