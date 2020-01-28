/*
Write a program that reads characters from cin into an array that you
allocate on the free store. Read individual characters until an exclamation
mark (!) is entered. Do not use a std::string.
*/
#include <iostream>

class StringFunctions {
public:
    static void readInChars(int size) {
        
        char* inputArray = new char[size];
        unsigned int charsRemaining = size;
        char* currentIndex = inputArray;
        char c;
        while (charsRemaining > 0 && std::cin >> c) {
            if (c == '!') {
                break;
            }
            *currentIndex = c;
            ++currentIndex;
            --charsRemaining;
        }
        std::cout << inputArray << std::endl;
    }
};

int main() {
    StringFunctions::readInChars(10);
}