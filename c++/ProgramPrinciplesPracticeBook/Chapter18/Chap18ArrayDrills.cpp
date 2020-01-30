#include <iostream>

class Chap18ArrayDrills {
public:
    static void f(int* array, int length) {
        int* la = new int[10];

        int count = length;
        while (count > 0) {
            *la = *array;
            ++la;
            ++array;
            --count;
        }

        la -= 10;
        array -= 10;
        for (int i = 0; i < length; i++) {
            std::cout << *la << " ";
            ++la;
        }
        std::cout << '\n';

        int* p = new int[length];

        for (int i = 0; i < length; i++) {
            p[i] = array[i];
        }

        for (int i = 0; i < length; i++) {
            std::cout << p[i] << " ";
        }
        delete p;
    }
};

int main() {

    int ga[] = {1,2,4,8,16,32,64,128,256,512};
    int aa[] = {1, 2*1, 3*2*1, 4*3*2*1, 5*4*3*2*1, 6*5*4*3*2*1, 7*6*5*4*3*2*1, 8*7*6*5*4*3*2*1, 9*8*7*6*5*4*3*2*1, 10*9*8*7*6*5*4*3*2*1 };
    Chap18ArrayDrills::f(aa, 10);
}