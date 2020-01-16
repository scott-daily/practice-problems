#pragma once
#include <string>
#include <iostream>
#include <stdexcept>

namespace LibraryOperations {

// Invariant member of the Book class
enum class Genre {
    fiction=1, nonfiction, periodical, biography, children
};

Genre int_to_genre(int x);

class Book {
    public:
        Book(Genre g, std::string ISBN, std::string title, std::string author, std::string copyrightDate);  // constructors
        Book() = delete;

        // nonmodifying operations
        Genre getGenre() const { return g; }
        std::string getAuthor() const { return author; }
        std::string getTitle() const { return title; }
        std::string getISBN() const { return ISBN; }
        std::string getCopyright() const { return copyrightDate; }
        bool getStatus() const { return status; }

        // modifying operations
        void checkOut(Book b);
        void checkIn (Book b);

    private:
        Genre g;
        std::string ISBN;
        std::string title;
        std::string author;
        std::string copyrightDate;
        bool status = true;  // true means in stock, default value
};

bool is_ISBN(std::string ISBN);
bool operator ==(const Book& a, const Book& b);
bool operator !=(const Book& a, const Book& b);
std::ostream& operator<<(std::ostream& os, const Book& b);
}

