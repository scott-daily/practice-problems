/*
Your task is to write a function which returns the sum of following series upto nth term(parameter).
Series: 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 + ...
Example:
SeriesSum(5) => 1 + 1/4 + 1/7 + 1/10 + 1/13 = "1.57"
*/
#include <iostream>
#include <string>
#include <math.h>

class SumSeries {
public:
    static std::string seriesSum(int n) {
        if (n == 0) {
            return "0.00";
        }
        if (n == 1) {
            return "1.00";
        }

        float total = 1.0;
        float denom = 4.0;
        for (int i = 1; i < n; i++) {
            total += 1.0 / denom;
            denom += 3.0;
        }

        return std::to_string(roundf(total * 100) / 100).substr(0,4);
    }
};

int main() {

    std::cout << SumSeries::seriesSum(344343);
    return 0;
}