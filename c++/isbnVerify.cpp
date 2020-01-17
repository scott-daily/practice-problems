// 13 Digit ISBN Verification algorithm
#include <string>
#include <iostream>
#include <stdexcept>
#include <algorithm>

class isbnVerify {

public:

    static bool is_ISBN(std::string ISBN)
    {   
        ISBN.erase(std::remove(ISBN.begin(), ISBN.end(), '-'), ISBN.end());

        if (ISBN.size() != 13) { return false; }

        int total{0};

        for (int i = 0; i < ISBN.size()-1; i++) {
            if (i%2 == 0) {
                total += (((int)ISBN[i] - 48) * 1);
            }
            else {
                total += (((int)ISBN[i] - 48) * 3);
            }
        }

        if (total % 10 == 0) 
        {
            if (((int)ISBN[12] - 48) == 0) { return true; }
            else { return false; }
        }
        else if (((int)ISBN[12] - 48) == (10 - (total % 10))) { return true;}
            else { return false; }
            
        return false;
    }
};

int main()
{
    std::string testISBN = "9781861972712";

    std::cout << isbnVerify::is_ISBN(testISBN);

    return 0;
}

