// Given a non-empty array of integers, every element appears twice except for one. 
// Return this singe element.
#include <iostream>
#include <vector>
#include <set>

class SingleNumber {
public:
    static int singleNumber(std::vector<int>& nums) {
        std::set<int> numSet;
        int length = nums.size();

        for (int i = 0; i < length; ++i) {
            auto exists = numSet.emplace(nums[i]);
            if (!exists.second) {
                numSet.erase(nums[i]);
            }
        }

        auto first = numSet.begin();
        return *first; 
    }
};

int main() {

    std::vector<int> testNums = {4,1,2,1,2};
    std::cout << SingleNumber::singleNumber(testNums) << std::endl;
}