#include <iostream>
#include <vector>

class Chap18VectorDrills {
public:
    static void f(std::vector<int> vect) {
        std::vector<int> lv(10);

        for (int i = 0 ; i < vect.size(); i++) {
            lv[i] = vect[i];
        }
        for (int i : lv) {
            std::cout << i << " ";
        }
        std::cout << '\n';

        std::vector<int> lv2 = vect;

        for (int i : lv2) {
            std::cout << i << " ";
        }
    }
};

int main() {
    std::vector<int> gv = {1,2,4,8,16,32,64,128,256,512};

    std::vector<int> vv = {1, 2*1, 3*2*1, 4*3*2*1, 5*4*3*2*1, 6*5*4*3*2*1, 7*6*5*4*3*2*1, 8*7*6*5*4*3*2*1, 9*8*7*6*5*4*3*2*1, 10*9*8*7*6*5*4*3*2*1};
    
    Chap18VectorDrills::f(vv);
}