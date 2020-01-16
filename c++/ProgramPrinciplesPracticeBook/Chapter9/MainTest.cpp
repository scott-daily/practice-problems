#include "Book.h"
#include <string>
#include <iostream>
#include <stdexcept>
#include <regex>
using namespace LibraryOperations;

int main()
{

Book *testBook = new Book(Genre::nonfiction, "978-3-16-148410-0", "Learn C++ in 1 day", "Joker Man", "5/23/1995");

 std::cout << &testBook << std::endl;
 std::cout << testBook->getTitle();

return 0;
}