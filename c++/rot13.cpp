/*
ROT13 is a simple letter substitution cipher that replaces a letter with the letter 13 letters after it in the alphabet.
Create a function that takes a string and returns the string ciphered with Rot13. If there are numbers or special characters included in the string,
they should be returned as they are. Only letters from the latin/english alphabet should be shifted, like in the original Rot13 "implementation".
*/
#include <string>
#include <iostream>
#include <map>

static std::string rot13(std::string msg)
{
    std::string noShift = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    std::string shift13 = "NOPQRSTUVWXYZABCDEFGHIJKLM";
    std::map<char,char> offsetMap;

    for (int i = 0; i < noShift.size(); i++) {
        offsetMap.insert(std::pair<char,char>(noShift[i],shift13[i]));
    }


    std::string shiftedResult;
    for (int i = 0; i < msg.size(); i++) {
        if (!isalpha(msg[i])) {
            shiftedResult.push_back(msg[i]);
        }
        else if (isupper(msg[i])) {
            auto iter = offsetMap.find(msg[i]);
            shiftedResult.push_back(iter->second);
        }
        else {
            auto iter = offsetMap.find(toupper(msg[i]));
            shiftedResult.push_back(tolower(iter->second));
        }
    }

  return shiftedResult;
}

int main() {
    std::cout << rot13("Test");

    return 0;
}