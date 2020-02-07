/*
Find the lexicographical last string in an unsorted vector<string>.
*/
#include <iostream>
#include <string>
#include <vector>

template<typename Iterator>
static Iterator high(Iterator first, Iterator last) {  // return an iterator to the element in [first:last) that has the highest value
    Iterator high = first;
    for (Iterator p = first; p!=last; ++p)
    if (*high<*p) high = p;
    return high;
}

int main() {
    std::vector<std::string> testVect = {"cat","zebra","zwerk","bat"};
    std::vector<int> testVect2 = {2, 2383, 7, 389033, 3783, 4848443, 1919};

    auto index = high(testVect2.begin(), testVect2.end());

    std::cout << *index;

    return 0;
}