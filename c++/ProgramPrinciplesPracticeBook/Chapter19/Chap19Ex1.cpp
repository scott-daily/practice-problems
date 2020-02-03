/*
Write a template function f() that adds the elements of one vector<T> to
the elements of another; for example, f(v1,v2) should do v1[i]+=v2[i] for
each element of v1.
*/
#include <iostream>
#include <string>
#include <vector>

class Chap19Ex1 {
public:
    template <typename T>
        static void f(std::vector<T>& v1, std::vector<T>& v2)
        {
            for (int i = 0; i < v1.size(); i++) {
                v1[i] += v2[i];
            }
        }
    
};

int main() {

    std::vector<int> test1 = {2, 5, 7, 8};
    std::vector<int> test2 = {3, 4, 5, 9};

    Chap19Ex1::f(test1, test2);

    for (int i = 0; i < test1.size(); i++) {
        std::cout << test1[i] << " ";
    }
    
    return 0;
}
