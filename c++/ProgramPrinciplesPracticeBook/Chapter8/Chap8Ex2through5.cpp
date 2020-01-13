#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

class PrintFunctions {
    public: 
        static void print(const std::string label, const std::vector<int> &vect) {
            std::cout << label << ": ";
            for (int num : vect) {
                std::cout << num << " ";
            }
        }

        static std::vector<int> fibonacci(int x, int y, std::vector<int> vect, int numElements) {
            vect.push_back(x);
            vect.push_back(y);

            for (int i = 2; i < numElements; ++i) {
                vect.push_back(vect[i-1] + vect[i-2]);
            }

            return vect;
        }

        static void reverseWithReference(std::vector<int> &vect) {
            std::sort(vect.begin(), vect.end(), std::greater<int>());
        }

        static std::vector<int> reverseWithConstReference(const std::vector<int> &vect) {
            std::vector<int> reversedVect = {};

            for (int i = vect.size(); i >= 0; --i) {
                    reversedVect.push_back(vect[i]);
                }

            return reversedVect;
        }
};

int main() 
{
     std::vector<int> emptyVect = {};
     std::vector<int> vectTest = PrintFunctions::fibonacci(1,2,emptyVect,10);

     //std::vector<int> returnedVect = PrintFunctions::reverseWithConstReference(vectTest);

     PrintFunctions::reverseWithReference(vectTest);

     PrintFunctions::print("test data",vectTest);

     return 0;
}
