/*
Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
Example:
Input: [3,9,20,null,null,15,7]
Output: [[3],[9,20],[15,7]];
*/
#include <vector>
#include <queue>
#include <iostream>
#include <math.h>

struct TreeNode
{
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
};

class TraverseTreeByLevel {
public:
    std::vector<std::vector<int>> levelOrder(TreeNode* root) {

        std::vector<std::vector<int>> resultVector;
        std::queue<TreeNode*> nodeQueue;
        std::vector<int> currLevelVect;

        if (root != nullptr) {

            nodeQueue.push(root);
            currLevelVect.push_back(root->val);
            resultVector.push_back(currLevelVect);
            currLevelVect.clear();

            while (!nodeQueue.empty()) {
                int queueSize = nodeQueue.size();
                int i;
                for (i = 0; i < queueSize; i++) {
                    TreeNode* currNode = nodeQueue.front();
                    nodeQueue.pop();

                    if (currNode->left != nullptr) {
                        nodeQueue.push(currNode->left);
                        currLevelVect.push_back(currNode->left->val);
                    }
                    if (currNode->right != nullptr) {
                        nodeQueue.push(currNode->right);
                        currLevelVect.push_back(currNode->right->val);
                    }
                }
                if (!currLevelVect.empty() && i == queueSize) {
                    resultVector.push_back(currLevelVect);
                    currLevelVect.clear();
                }
                
            }
        }
        return resultVector; 
    }
};