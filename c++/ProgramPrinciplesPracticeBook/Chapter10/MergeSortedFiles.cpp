/*
Write a program that takes two files containing sorted whitespace-separated
words and merges them, preserving order.
*/
#include <iostream>
#include <fstream>
#include <string>
#include <set>

class MergeSortedFiles {

public:
    static void mergeSortedFiles() {
        
        std::cout << "Please enter the first input file name: ";
        std::string fileName1;
        std::cin >> fileName1;
        std::ifstream inputStream1 {fileName1};

        std::cout << "Please enter the second input file name: ";
        std::string fileName2;
        std::cin >> fileName2;
        std::ifstream inputStream2 {fileName2};

        if (!inputStream1) {
            std::cerr << "Cannot open file 1";
        }
        if (!inputStream2) {
            std::cerr << "Cannot open file 2";
        }

        std::cout << "Please enter name of output file: ";
        std::string outputFile;
        std::cin >> outputFile;
        std::ofstream outputStream {outputFile};

        if (!outputStream) {
            std::cerr << "Cannot open output file";
        }

        std::set<std::string> mergedSet;
        std::string word;

        while (inputStream1 >> word) {
            mergedSet.insert(word);
        }

        while (inputStream2 >> word) {
            mergedSet.insert(word);
        }

        std::set<std::string>::iterator it;
        for (it = mergedSet.begin(); it != mergedSet.end(); ++it) {
            outputStream << *it << std::endl;
        }
    }
};

int main() {
    MergeSortedFiles::mergeSortedFiles();
}