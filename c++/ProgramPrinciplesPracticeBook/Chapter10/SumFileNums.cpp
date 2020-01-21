/*
Write a program that produces the sum of all the numbers in a file of
whitespace-separated integers.
*/
#include <iostream>
#include <string>
#include <fstream> 
#include <stdexcept>

class SumFileNums {

public:
    static int sumFileNums() {
        std::cout << "Please enter the input file name: ";
        std::string fileName;
        std::cin >> fileName;
        std::ifstream inputStream {fileName};

        if (inputStream.is_open()) {
            std::cout << "It's open" << std::endl;
        }

        if (!inputStream) {
            std::cerr << "Cannot open the file "; //<< fileName;
        }

        int total = 0;
        int currentNum;

        while (inputStream >> currentNum) {
            total += currentNum;
        }
        return total;
    } 
};

int main() {
    int result = SumFileNums::sumFileNums();
    std::cout << result << std::endl;
}