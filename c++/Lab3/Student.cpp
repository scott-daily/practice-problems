#include "Student.h"
#include <string>
#include <iostream>

Student::Student()
{

}

Student::Student(const std::string & firstName, const std::string & lastName, int age, const std::string & phone)
    : Person (firstName, lastName, age, phone)
{};

Student::~Student()
{

}

void Student::OutputIdentity()
{
    std::cout << "I am a student" << std::endl;
}



void Student::OutputAge() const
{
    Person::OutputAge();
    std::cout << "I am a student" << std::endl;
}

void Student::OutputName()
{
    std::cout << "My name is " << this->GetFirstName() << " " << this->GetLastName() << std::endl;
}