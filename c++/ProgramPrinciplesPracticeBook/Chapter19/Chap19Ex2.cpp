/*
Write a template function that takes a vector<T> vt and a vector<U> vu as
arguments and returns the sum of all vt[i]*vu[i]s.
*/
#include <iostream>
#include <vector>

class Chap19Ex2 {
public: 
    template <typename T> 
    static int multiplyValues(std::vector<T> v1, std::vector<T> v2) {
        int sum = 0;
        for (int i = 0; i < v1.size(); i++) {
            sum += v1[i] * v2[i];
        }
        return sum;
    }
};

int main() {

    std::vector<int> test1 = {2, 5, 7, 8};
    std::vector<int> test2 = {3, 4, 5, 9};

    std::cout << Chap19Ex2::multiplyValues(test1, test2);
}
