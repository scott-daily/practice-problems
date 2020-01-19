#include "Book.h"
#include "Patron.h"
#include "Library.h"
#include <string>
#include <iostream>
#include <stdexcept>
using namespace LibraryOperations;

int main()
{

Book *testBook = new Book(Genre::nonfiction, "978-3-16-148410-0", "Learn C++ in 1 day", "Joker Man", "5/23/1995");

 std::cout << *testBook << std::endl;

testBook->checkOut(); 
std::cout << testBook->getStatus() << std::endl;

testBook->checkIn();
std::cout << testBook->getStatus() << std::endl;

Library *testLibrary = new Library("Best Library");
Patron *testPatron = new Patron("Scott", "383743EZX");

std::cout << *testPatron << std::endl;

testLibrary->returnBook(*testBook);
testLibrary->addPatron(*testPatron);
testLibrary->printBooks();
testLibrary->printPatrons();

return 0;
}