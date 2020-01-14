/* Write a function that finds the smallest and the largest element of a vector
argument and also computes the mean and the median. Do not use global
variables. Either return a struct containing the results or pass them back
through reference arguments.
*/
#include <iostream>
#include <vector>
#include <climits>
#include <algorithm>

class VectorStats {
    public:

    struct StatsStruct
            {
            int smallest = INT_MAX;
            int largest = INT_MIN;
            double mean;
            int median;
            };

        StatsStruct calculateStats(const std::vector<int> &vect) 
        {
            VectorStats::StatsStruct valueBin;
            std::vector<int> orderedValues;

            for (int num : vect) 
            {
                valueBin.mean += num;
                orderedValues.push_back(num);

                if (num > valueBin.largest) 
                {
                    valueBin.largest = num;
                }
                if (num < valueBin.smallest) 
                {
                    valueBin.smallest = num;
                }
            }

            valueBin.mean /= static_cast<double>(vect.size());
            std::sort(orderedValues.begin(), orderedValues.end(), std::less<int>());
            valueBin.median = orderedValues.at(orderedValues.size()/2);
            
            return valueBin;
    }
};

int main()
{
    std::vector<int> testVect = {183,5,38373,2,583,713,28,1818,5,2,39999,1443,39};
    VectorStats statsTest;
    VectorStats::StatsStruct testStruct; 
    testStruct = statsTest.calculateStats(testVect);

    std::cout << "smallest: " << testStruct.smallest << std::endl;
    std::cout << "largest: " << testStruct.largest << std:: endl;
    std::cout << "mean: " << testStruct.mean << std::endl;
    std::cout << "median: " << testStruct.median << std::endl;
}