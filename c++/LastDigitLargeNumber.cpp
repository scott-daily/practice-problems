/*
Define a function that takes in two non-negative integers a and b and returns the last decimal digit of a^b. 
Note that a and b may be very large!
For example, the last decimal digit of 9^7 is 9, since 9^7 = 4782969. 
The last decimal digit of (2^200)^(2^300), which has over 10^92 decimal digits, is 6. Also, please take 0^0 to be 1.
*/
#include <iostream>
#include <string>
#include <math.h> 

    static int lastDigitLargePower(std::string str1, std::string str2) {
       char str1LastDigit = str1[str1.size()-1];

       if (str1LastDigit == '0' && str2 != "0") {
            return 0;
        }
        
        if (str2 == "0") {
            return 1;
        }

        if (str1LastDigit == '1' || str1LastDigit == '5' 
            || str1LastDigit == '6') {
                int result = str1LastDigit - '0';
                return result;
            }
        
        if (str1.size() < 5 && str2.size() < 2) {
            long long int result = pow(std::stoi(str1),std::stoi(str2));
            return result % 10;
        }

        int divisor;
        if (str1LastDigit == '2' || str1LastDigit == '3' || str1LastDigit == '7' || str1LastDigit == '8') {
            divisor = 4;
        }
        else if (str1LastDigit == '4' || str1LastDigit == '2') {
            divisor = 2;
        }

        std::string result;
        int currRemainder;
        for (int i = 0; i < str2.size(); i++) {
            if (i == 0) {
                int tempDividend = std::stoi(str2.substr(i,2));
                int tempResult = tempDividend / divisor;
                result.append(std::to_string(tempResult));
                currRemainder = tempDividend - (tempResult * divisor);
                if (str2.size() > 2) {
                    i++;
                }
            }
            else if (i < str2.size()-1) {
                std::string stringDividend;
                if (currRemainder != 0) {
                    stringDividend.append(std::to_string(currRemainder));
                    stringDividend.append(std::to_string(str2[i] - '0'));
                }
                else {
                    stringDividend.append(std::to_string(str2[i] - '0'));
                }
                int tempDividend = std::stoi(stringDividend);
                int tempResult = tempDividend / divisor;
                result.append(std::to_string(tempResult));
                currRemainder = tempDividend - (tempResult * divisor);
            }
            else {
                std::string stringDividend;
                if (str2.size() > 2) {
                    if (currRemainder != 0) {
                        stringDividend.append(std::to_string(currRemainder));
                        stringDividend.append(std::to_string(str2[i] - '0'));
                    }
                    else {
                        stringDividend.append(std::to_string(str2[i] - '0'));
                    }
                    int tempDividend = std::stoi(stringDividend);
                    int tempResult = tempDividend / divisor;
                    result.append(std::to_string(tempResult));
                    currRemainder = tempDividend - (tempResult * divisor);
                }

                if (currRemainder == 0) {
                    switch (str1LastDigit) {
                        case '2':
                            return 6;
                        case '3':
                            return 1;
                        case '4':
                            return 6;
                        case '7':
                            return 1;
                        case '8':
                            return 6;
                        case '9':
                            return 1;
                    }
                }
                int result = pow(str1LastDigit - '0', currRemainder);
                if (result < 10) {
                    return result;
                }
                else {
                    return result % 10;
                }
            }
        }
        return -1;
    }

int main() {

    int result = lastDigitLargePower("2","8782");
    std::cout << result;
    return 0;
}
