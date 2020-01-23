/*
Write a program that removes all vowels from a file. 
Example Input: Once upon a time! 
Example Output: nc pn tm!
*/
#include <iostream>
#include <fstream>
#include <string>
#include <sstream>
#include <vector>
#include <algorithm>

class Disemvowel {
public:
    static void removeVowels(std::string fileName) {

        std::ifstream inputStream {fileName};

        if (!inputStream) {
            std::cout << "Could not open file" << std::endl;
        }

        std::vector<char> vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        std::vector<std::string> fileData;
        std::string line;
        std::getline(inputStream,line);
        for (int i = 0; i < line.length(); i++) { 
            if (find(vowels.begin(), vowels.end(), line[i]) != vowels.end()) { 
                line = line.replace(i, 1, ""); 
            } 
        }

        std::stringstream ss(line);
        for (std::string word; ss >> word; ) {
            fileData.push_back(word);
        }

        std::ofstream outputStream {fileName};
        if (!outputStream) {
            std::cerr << "Cannot open output file";
        }

        std::vector<std::string>::iterator it;
        for (it = fileData.begin(); it != fileData.end(); ++it) {
            outputStream << *it << " ";
        }
    }
};

int main() {
    Disemvowel::removeVowels("test.txt");
    return 0;
}