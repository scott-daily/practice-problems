#include "Book.h"
#include <string>
#include <iostream>
#include <stdexcept>
#include <algorithm>

namespace LibraryOperations {
// member function definitions:

Genre int_to_genre(int x)
{
    if (x<int(Genre::fiction) || int(Genre::children)<x) { throw std::invalid_argument("Invalid Genre."); }
    else { return Genre(x); }

}

Book::Book(Genre g, std::string ISBN, std::string title, std::string author, std::string copyrightDate)
    :g{g}, ISBN{ISBN}, title{title}, author{author}, copyrightDate{copyrightDate}

{
    if (!is_ISBN(ISBN)) throw std::invalid_argument("ISBN is not valid.");
}

void Book::checkOut() 
{
    if (status) {
         status = false; 
    }
    else { throw std::invalid_argument("Book is already checked out."); }
}

void Book::checkIn() 
{
    if (!status) { 
        status = true; 
    }
    else { throw std::invalid_argument("Book is already checked in."); }
}

bool is_ISBN(std::string ISBN)
{   
    ISBN.erase(std::remove(ISBN.begin(), ISBN.end(), '-'), ISBN.end());

    if (ISBN.size() != 13) { return false; }

    int total = 0;
    for (int i = 0; i < ISBN.size()-1; i++) {
        if (i%2 == 0) {
            total += (((int)ISBN[i] - 48) * 1);
        }
        else {
            total += (((int)ISBN[i] - 48) * 3);
        }
    }

    if (total % 10 == 0) {
        if (((int)ISBN[12] - 48) == 0) { 
            return true; }
        else { 
            return false; }
    }
    else if (((int)ISBN[12] - 48) == (10 - (total % 10))) {
        return true;
    } else { 
        return false; 
    }
    return false;
}

bool operator ==(const Book& a, const Book& b)
{
    return a.getISBN() == b.getISBN();
}

bool operator !=(const Book& a, const Book& b)
{
    return !(a.getISBN() == b.getISBN());
}

std::ostream& operator <<(std::ostream& os, const Book& b)
{
    return os << "Title: " << b.getTitle() << std::endl
                << "Author: " << b.getAuthor() << std::endl
                << "ISBN: " << b.getISBN() << std::endl;
}
}