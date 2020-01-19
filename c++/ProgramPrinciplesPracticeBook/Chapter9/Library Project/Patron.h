#pragma once
#include <string>
#include <iostream>

namespace LibraryOperations {

class Patron {
    public:
        Patron(std::string userName, std::string libraryID);
        Patron() = delete;

        std::string getUserName() const { return userName; }
        std::string getLibraryID() const { return libraryID; }
        double getFee() const { return fee; }

        void payFee(double amount);
        void addFee(double amount);

    private:
        std::string userName;
        std::string libraryID;
        double fee = 0;
        bool feesOwed{false};
};

bool owesFees(const Patron& p);
std::ostream& operator<<(std::ostream& os, const Patron& p);
bool operator ==(const Patron& a, const Patron& b);
}