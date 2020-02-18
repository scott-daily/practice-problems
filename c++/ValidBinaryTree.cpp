/*
Given a binary tree, determine if it is a valid binary search tree (BST).
Assume a BST is defined as follows:
The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.
 
Example 1:

    2
   / \
  1   3

Input: [2,1,3]
Output: true
Example 2:

    5
   / \
  1   4
     / \
    3   6

Input: [5,1,4,null,null,3,6]
Output: false
Explanation: The root node's value is 5 but its right child's value is 4.
*/
#include <iostream>
#include <stack>

struct TreeNode
{
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
};

class ValidBinaryTree {
public:
     bool isValidBST(TreeNode* root) {
        if (root == nullptr) {
            return true;
        }
        
        std::stack<TreeNode*> nodeStack;
        TreeNode* current = root; 
        TreeNode* prev = nullptr;
         
        while (current || !nodeStack.empty()) {
            while(current) {
                nodeStack.push(current);
                current = current->left;
            }

            current = nodeStack.top();
            nodeStack.pop();

            if (prev && prev->val >= current->val) {
                return false;
            }

            prev = current;
            current = current->right;
        }

        return true;
    }
};