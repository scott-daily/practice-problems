#include "Library.h"
#include "Patron.h"
#include "Book.h"
#include <string>
#include <iostream>
#include <stdexcept>
#include <algorithm>
#include <vector>

namespace LibraryOperations {

Library::Library(std::string libraryName) 
    :libraryName{libraryName}{}


void Library::printBooks() {
    for (Book b : bookVect) {
        std::cout << b << std::endl;
    }
}

void Library::printPatrons() {
    for (Patron p : patronVect) {
        std::cout << p << std::endl;
    }
}

void Library::printTransactions() {
    for (Transaction t : transactionVect) {
        std::cout << t << std::endl;
    }
}

void Library::addPatron(Patron p) {
    patronVect.push_back(p);
}

void Library::returnBook(Book b) {
    bookVect.push_back(b);
}

void Library::checkoutBook(Book b, Patron p, std::string date) {
    if (std::find(bookVect.begin(), bookVect.end(), b) == bookVect.end()) {
        throw std::invalid_argument("Book is not in the library");
    }
    
    if (std::find(patronVect.begin(), patronVect.end(), p) == patronVect.end()) {
        throw std::invalid_argument("Patron is not at the library");
    }
    
    if (p.getFee() != 0.0) {
        throw std::invalid_argument("Patron owes a fee.  The fee must be paid before checking out a book.");
    }

    Transaction trans = {b, p, date};
    transactionVect.emplace_back((Transaction(b, p, date)));
}


std::vector<Patron> Library::debtMembers() {
    if (patronVect.size() == 0) { std::cout << "There are no patrons" << std::endl; }

    std::vector<Patron> indebtedPatrons;

    for (Patron p : patronVect) {
        if (p.getFee() > 0.0) {
            indebtedPatrons.push_back(p);
        }
    }
    return indebtedPatrons;
}

std::ostream& operator <<(std::ostream& os, const Library::Transaction& t)
{
    return os << "Book: " << t.b << std::endl
                << "Patron: " << t.p << std::endl
                << "Date: " << t.date << std::endl;
}

}