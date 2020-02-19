/*
Given two binary search trees root1 and root2.
Return a list containing all the integers from both trees sorted in ascending order.
*/
#include <vector>
#include <iostream>
#include <algorithm>

struct TreeNode
{
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
};

class SortTwoTrees {
    std::vector<int> getAllElements(TreeNode* root1, TreeNode* root2) {
        std::vector<int> sortedResult;

        inOrder(root1,sortedResult);
        inOrder(root2, sortedResult);

        sort(sortedResult.begin(), sortedResult.end());
        for (int i = 0; i < sortedResult.size(); i++) {
            std::cout << sortedResult[i] << " ";
        }
        return sortedResult;
    }

    void inOrder(TreeNode* root, std::vector<int>& sortedResult) {
        if (root == nullptr) {
            return;
        }
        else {
            inOrder(root->left, sortedResult);
            sortedResult.push_back(root->val);
            inOrder(root->right, sortedResult);
        }
    }
};

