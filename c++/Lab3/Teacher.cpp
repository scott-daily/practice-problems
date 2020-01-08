#include "Teacher.h"
#include <string>
#include <iostream>

Teacher::Teacher()
{

}

Teacher::Teacher(const std::string & firstName, const std::string & lastName, int age, const std::string & phone)
    : Person (firstName, lastName, age, phone)
{};

Teacher::~Teacher()
{
    
}

void Teacher::OutputIdentity()
{
    std::cout << "I am a teacher" << std::endl;
}

void Teacher::OutputAge() const
{
    Person::OutputAge();
    std::cout << "I am a teacher" << std::endl;
}

void Teacher::OutputName()
{
    std::cout << "My name is " << this->GetFirstName() << " " << this->GetLastName() << std::endl;
}