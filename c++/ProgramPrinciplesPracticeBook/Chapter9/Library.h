#pragma once
#include "Patron.h"
#include "Book.h"
#include <string>
#include <iostream>
#include <stdexcept>
#include <algorithm>
#include <vector>

namespace LibraryOperations {

class Library {
    public:

    struct Transaction {
        Book b;
        Patron p;
        std::string date;
        Transaction(const Book b, const Patron p, const std::string date)
        :b(b), p(p), date(date){}
    };
        Library(std::string libraryName);
        Library() = delete;

        void printBooks();
        void printPatrons();
        void printTransactions();

        void returnBook(Book b);
        void addPatron(Patron p);
        void checkoutBook(Book b, Patron p, std::string date);
        std::vector<Patron> debtMembers();


    private:
        std::string libraryName;
        std::vector<Book> bookVect;
        std::vector<Patron> patronVect;
        std::vector<Transaction> transactionVect;

};

std::ostream& operator<<(std::ostream& os, const Library::Transaction& t);
}