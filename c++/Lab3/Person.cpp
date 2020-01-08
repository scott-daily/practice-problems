#include "Person.h"
#include <iostream>
#include <string>

Person::Person()
{

}

Person::Person(const std::string & firstName, const std::string & lastName, int age, const std::string & phone)
    : firstName(firstName), lastName(lastName), phone(phone), age(age)
{}

Person::~Person()
{

}

std::string Person::GetFirstName()
{
    return this->firstName;
}

std::string Person::GetLastName()
{
    return this->lastName;
}

std::string Person::GetPhone()
{
    return this->phone;
}

void Person::OutputAge() const
{
    std::cout << "I am " << this->age << " years old" << std::endl;
}
