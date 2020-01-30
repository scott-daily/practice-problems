/*
1. Write a function, char* strdup(const char*), that copies a C-style string
into memory it allocates on the free store. Do not use any standard library
functions. Do not use subscripting; use the dereference operator *
instead.
*/
#include <iostream>
#include <vector>
#include <cstring>

class Chap18Ex {
public:
    static char* strdup(const char* cstring) {
        
        char* stringCopy = new char[strlen(cstring)];
        
        int length = strlen(cstring);
        int size = strlen(cstring);
        while (size > 0) {
            *stringCopy = *cstring;
            ++stringCopy;
            ++cstring;
            --size;
        }
        cstring -= length;
        stringCopy -= length;

        return stringCopy;
    }

    static int strlen(const char* cstring) {
        int length = 0;

        while (*cstring != '\0') {
            length++;
            cstring++;
        }
        return length;
    }
};

int main() {
    char testString[] = {'B', 'u', 't', 't', 'e', 'r', '\0'};
    char* getCopy = Chap18Ex::strdup(testString);

    while (*getCopy != '\0') {
        std::cout << *getCopy << " ";
        getCopy++;
    }
}