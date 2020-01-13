#include <iostream>


class FunctionPassTest {
    public:
        static void swap_v(int a,int b) {
            int temp; 
            temp = a, 
            a = b; 
            b = temp;
        }

        static void swap_r(int& a, int& b) {
            int temp;
            temp = a;
            a = b;
            b = temp;
        }

        static void swap_cr(const int& a, const int& b) {
            int temp;
            temp = a;
            a = b;
            b = temp;
        }
        
};


int main()
{
    int x = 7;
    int y = 9;

    FunctionPassTest::swap_cr(x,y); 
    FunctionPassTest::swap_cr(7,9);

    std::cout << x << std::endl;
    std::cout << y << std::endl;

    return 0;
}