/*
Given two binary search trees root1 and root2.
Return a list containing all the integers from both trees sorted in ascending order.
*/
#include <vector>
#include <iostream>
#include <algorithm>
#include <queue>
// 1) create two queues and add all items from each tree into their own queue.  
// 2) Compare queues and add the least of each comparison to vector queue1.top() < queue2.top()  & pop()
// 3) return once both queues are empty.

struct TreeNode
{
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
};

class SortTwoTrees2 {
    std::vector<int> getAllElements(TreeNode* root1, TreeNode* root2) {
        std::vector<int> sortedResult;
        std::queue<int> tree1Queue;
        std::queue<int> tree2Queue;

        inOrder(root1, tree1Queue);
        inOrder(root2, tree2Queue);

        while (!tree1Queue.empty() && !tree2Queue.empty()) {
            if (tree1Queue.front() < tree2Queue.front()) {
                sortedResult.push_back(tree1Queue.front());
                tree1Queue.pop();
            }
            else {
                sortedResult.push_back(tree2Queue.front());
                tree2Queue.pop();
            }
        }

        while (!tree1Queue.empty()) {
            sortedResult.push_back(tree1Queue.front());
            tree1Queue.pop();
        }
        while (!tree2Queue.empty()) {
            sortedResult.push_back(tree2Queue.front());
            tree2Queue.pop();
        }

        return sortedResult;
    }

    void inOrder(TreeNode* root, std::queue<int>& treeQueue) {
        if (root == nullptr) {
            return;
        }
        else {
            inOrder(root->left, treeQueue);
            treeQueue.push(root->val);
            inOrder(root->right, treeQueue);
        }
    }
};