#include "Patron.h"
#include <string>
#include <iostream>
#include <stdexcept>

namespace LibraryOperations {

Patron::Patron(std::string userName, std::string libraryID)
    :userName{userName}, libraryID{libraryID}{}

void Patron::payFee(double amount) {
    if (fee - amount >= 0.0) {
        fee -= amount;
    }
    else {
        throw std::invalid_argument("Amount is invalid");
    }
}

void Patron::addFee(double amount)
{
    fee += amount;
}

bool owesFees(const Patron& p) {
    if (p.getFee() > 0.0) {
         return true; 
    } else { 
        return false; 
    }
}

std::ostream& operator <<(std::ostream& os, const Patron& p)
{
    return os << "userName: " << p.getUserName() << std::endl
                << "Library ID: " << p.getLibraryID() << std::endl
                << "Fees Owed: " << p.getFee() << std::endl;
}
}