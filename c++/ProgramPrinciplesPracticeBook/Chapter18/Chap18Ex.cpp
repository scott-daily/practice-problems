/*
2. Write a function, char* findx(const char* s, const char* x), that finds the
first occurrence of the C-style string x in s. Do not use any standard library
functions. Do not use subscripting; use the dereference operator *
instead.
*/
#include <iostream>
#include <vector>
#include <cstring>

class Chap18Ex {
public:

    static char* findx(const char* target, const char* word) { // Search for word in target
        if (strlen(target) < strlen(word)) {
            return nullptr;
        }

        char* targetCopy = strdup(target);
        char* wordCopy = strdup(word);

        int letterCount = 0;
        int targetLength = strlen(target);

        while (targetLength > 0) {
            if (*targetCopy == *wordCopy) {
                if (letterCount == strlen(word)-1) {
                    targetCopy -= strlen(word)-1;
                    return targetCopy;
                }
                ++targetCopy;
                ++wordCopy;
                ++letterCount;
                --targetLength;
            }
            else {
                ++targetCopy;
                --targetLength;
                wordCopy -= letterCount;
                letterCount = 0;
            }
        }
        return nullptr;
    }

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
    char testTarget[] = {'Z','e','t','t','e', 'r', '\0'};
    char testWord[] = {'t', 't', 'e', 'r', '\0'};

    char* getCopy = Chap18Ex::findx(testTarget,testWord);

    if (getCopy != nullptr) {
        while (*getCopy != '\0') {
            std::cout << *getCopy << " ";
            getCopy++;
        }
    }
    else {
        std::cout << "Not Found";
    }
}