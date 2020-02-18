#include <vector>
#include <iostream>

class BinarySearch {
public:
    static int binarySearch(std::vector<int>& intVector, int n) {
        int min = 0;
        int max = intVector.size()-1;

        while (max >= min) {
            int guess = (min + max) / 2;
            if (intVector[guess] == n) {
                return guess;
            }
            else if (intVector[guess] < n) {
                min = guess + 1;
            }
            else {
                max = guess - 1;
            }
        }
        return -1;
    }
};

int main() {
    std::vector<int> testVect = {2,5,7,9,13,16,18,22,28,29,39,49,59};

    std::cout << BinarySearch::binarySearch(testVect, 28);
}