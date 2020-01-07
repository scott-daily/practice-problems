/*
Given a string S of lowercase letters, a duplicate removal consists of choosing two adjacent and equal letters, and removing them.
We repeatedly make duplicate removals on S until we no longer can.
Return the final string after all such duplicate removals have been made.  It is guaranteed the answer is unique.
Example:
Input: "abbaca"
Output: "ca"
*/
#include <iostream>
#include <deque> 
#include <string>
using namespace std;

class NoAdjacentChars {

public:
    static string removeDuplicates(string S) {

        deque<char> charQue;
        string result;

        for (int i = 0 ; i < S.size(); i++) {
            if (charQue.size() >= 1) {
                if (charQue.front() != S.at(i)) {
                    charQue.push_front(S.at(i));
                }
                else {
                    charQue.pop_front();
                }
            }
            else {
                charQue.push_front(S.at(i));
            }
        }

        while (!charQue.empty()) 
            {   
                result.append(string{charQue.back()});
                charQue.pop_back(); 
            } 
        return result;
    }
};

int main() 
{
    string test = "abbaca"; // Expected: "ca"

    NoAdjacentChars::removeDuplicates(test);

    return 0;
}