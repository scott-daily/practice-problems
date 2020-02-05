/*
Complete the function so that it converts dash/underscore delimited words into camel casing. 
The first word within the output should be capitalized only if the original word was capitalized.
Examples:
to_camel_case("the-stealth-warrior") // returns "theStealthWarrior"
to_camel_case("The_Stealth_Warrior") // returns "TheStealthWarrior"
*/

#include <string>
#include <iostream>
#include <vector>

class StringToCamelCase {
public:
    static std::string to_camel_case(std::string text) {

        std::vector<std::string> textVect;
        std::vector<char> wordVect;

        for (int i = 0; i < text.size(); i++) {
            if (text[i] != '-' && text[i] != '_') {
                wordVect.push_back(text[i]);
                if (i == text.size() - 1) {
                    std::string tempWord(wordVect.begin(), wordVect.end());
                    textVect.push_back(tempWord);
                }
            }
            else {
                std::string tempWord(wordVect.begin(), wordVect.end());
                textVect.push_back(tempWord);
                wordVect.clear();
            }
        }
        std::string result;
        for (int i = 0; i < textVect.size(); i++) {
            if (i == 0) {
                result.append(textVect[i]);
            }
            else {
                textVect[i][0] = toupper(textVect[i][0]);
                result.append(textVect[i]);
            }
        }
        return result;
    }
};

int main() {
    std::string test = "The_Stealth_Warrior";

    std::cout << StringToCamelCase::to_camel_case(test) << std::endl;
    return 0;
}