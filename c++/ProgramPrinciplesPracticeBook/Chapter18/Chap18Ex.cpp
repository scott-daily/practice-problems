/*
3. Write a function, int strcmp(const char* s1, const char* s2), that compares
C-style strings. Let it return a negative number if s1 is lexicographically
before s2, zero if s1 equals s2, and a positive number if s1 is lexicographically
after s2. Do not use any standard library functions. Do not use
subscripting; use the dereference operator * instead.
*/
#include <iostream>
#include <vector>
#include <cstring>

class Chap18Ex {
public:
    static int strcmp(const char* s1, const char* s2) {
        char* s1Copy = strdup(s1);
        char* s2Copy = strdup(s2);
        tolower(s1Copy);
        tolower(s2Copy);

        int s1Length = strlen(s1);
        int s2Length = strlen(s2);

        int smallestLength = 0;
        if (s1Length > s2Length) {
            smallestLength = s2Length;
        }
        else {
            smallestLength = s1Length;
        }

        while (smallestLength > 0) {
            if (*s1Copy < *s2Copy) {
                return -1;
            }
            else if (*s1Copy > *s2Copy) {
                return 1;
            }
            else {
                if (smallestLength == 1) {
                    return 0;
                }
                ++s1Copy;
                ++s2Copy;
                smallestLength--;
            }
        }
    }

    static void tolower(char* string) {
        while(*string != '\0') {
        if(*string >= 'A' && *string <= 'Z') {
            *string = *string + 32;
        }
        ++string;
        }
    }

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
    char testTarget[] = {'b', 'z', '\0'};
    char testWord[] = {'b', 'z', '\0'};

    std::cout << strcmp(testTarget,testWord) << std::endl;
}