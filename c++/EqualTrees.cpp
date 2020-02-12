/*
Given two binary trees, write a function to check if they are the same or not.
Two binary trees are considered the same if they are structurally identical and the nodes have the same value.
*/
struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
};

#include <vector>
#include <iostream>

class EqualTrees {
public:
    bool isSameTree(TreeNode* p, TreeNode* q) {
        if (p==NULL && q==NULL) {
            return true;
        }
    
        if (p!=NULL && q!=NULL) { 
            return (p->val == q->val && isSameTree(p->left, q->left) && isSameTree(p->right, q->right)); 
        } 
      
        return false; 
    } 
};