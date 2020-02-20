// Given a binary tree, return the inorder traversal of its nodes' values.

#include <vector>

struct TreeNode
{
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
};

class inOrderTraversal {
public:
    std::vector<int> inorderTraversal(TreeNode* root) {
        std::vector<int> inorderVect;
        if (root == nullptr) {
            return inorderVect;
        }
        inOrder(root, inorderVect);
        return inorderVect;
    }
    
    void inOrder(TreeNode* root, std::vector<int>& treeVect) {
        if (root == nullptr) {
            return;
        }
        else {
            inOrder(root->left, treeVect);
            treeVect.push_back(root->val);
            inOrder(root->right, treeVect);
        }
    }
};