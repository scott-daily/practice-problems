/*
Write a program that produces the sum of all the whitespace-separated integers
in a text file. For example, bears: 17 elephants 9 end should output
26.
*/
#include <iostream>
#include <string>
#include <fstream>

class SumOnlyInts {
public:
    static int sumOnlyInts() {

        std::cout << "Please enter the file name: ";
        std::string fileName;
        std::cin >> fileName;
        std::ifstream inputStream {fileName};

        if (!inputStream) {
            std::cerr << "Cannot open file";
        }

        std::cout << "Please enter name of output file: ";
        std::string outputFile;
        std::cin >> outputFile;
        std::ofstream outputStream {outputFile};

        if (!outputStream) {
            std::cerr << "Cannot open output file";
        }

        int total = 0;
        int currentNum;

        while (inputStream >> currentNum || !inputStream.eof()) {
            if (inputStream.fail()) { 
                inputStream.clear();
                std::string dummy;
                inputStream >> dummy;
                continue;
            }
            total+= currentNum;
        }
        return total;
    }
};

int main() {
    int result = SumOnlyInts::sumOnlyInts();
    std::cout << result;
}
