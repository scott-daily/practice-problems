/*
Write a function, void to_lower(char* s), that replaces all uppercase characters
in the C-style string s with their lowercase equivalents. For example,
Hello, World! becomes hello, world!. Do not use any standard
library functions. A C-style string is a zero-terminated array of characters,
so if you find a char with the value 0 you are at the end.
*/
#include <iostream>

class StringFunctions {
public:
    static void to_lower(char* s) {

        int i = 0;
        while (s[i] != '\0') {
            s[i] = tolower(s[i]);
            i++;
        }
    }
};

int main() {
    char testString[]{ "CATMAN" };

    StringFunctions::to_lower(testString);

    std::cout << testString;
}