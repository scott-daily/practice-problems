#include <iostream>
#include <string>
#include <sstream>

class RGBToHex {
public:
    static std::string rgb(int r, int g, int b) {

        std::string hexValue;
        hexValue.append(convertToHex(r));
        hexValue.append(convertToHex(g));
        hexValue.append(convertToHex(b));

        return strToUpper(hexValue);
    }

    static std::string convertToHex(int rgbValue) {
        if (rgbValue < 0) {
            rgbValue = 0;
        }

        if (rgbValue > 255) {
            rgbValue = 255;
        }

        double dividedValue = rgbValue / 16.0;
        int firstDigit = dividedValue;
        std::stringstream ss;
        ss << std::hex << firstDigit;

        double remainder = dividedValue - (double) firstDigit;
        int secondDigit = remainder * 16;
        ss << std::hex << secondDigit;

        return ss.str();
    }

    static std::string strToUpper(std::string str) {
        std::string result;
        for (int i = 0; i < str.size(); i++) {
            result += toupper(str[i]);
        }
        return result;
    }
};

int main() {
    std::cout << RGBToHex::rgb(-20,275,125);
}