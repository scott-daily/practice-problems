/*
Write a function, char* findx(const char* s, const char* x), that finds the
first occurrence of the C-style string x in s.
*/
#include <iostream>
#include <cstring>

class StringFunctions {
public:
    static const char* findX(const char* s, const char* x) {

        const char* p = std::strstr(s, x);

        if (p) {
            return p;
        }
        else {
            return "String not found.";
        }
    }
};

int main() {
    const char *str = "The ship docked at the island";
    const char *target = "dock";

    const char* result = StringFunctions::findX(str, target);
    
    std::cout << result << std::endl;
}