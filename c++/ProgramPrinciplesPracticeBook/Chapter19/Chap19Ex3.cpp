/*
Write a template class Pair that can hold a pair of values of any type.
*/
#include <iostream>

template <typename T, typename U> 
class Pair {
public:
    T first;
    U second;

};


int main() {
    Pair<char,double> testPair;

    testPair.first = 'A';
    testPair.second = 3.3487;

    std::cout << testPair.first << std::endl;
    std::cout << testPair.second << std::endl;

    return 0;
}

