#pragma once
#include <string>
#include <iostream>

class Person
{
private:
    std::string firstName;
    std::string lastName;
    int age;

protected:
    std::string phone;

public:
    Person();

    Person(const std::string & firstName, const std::string & lastName, int age, const std::string & phone);

    virtual ~Person();

    std::string GetFirstName();

    std::string GetLastName();

    std::string GetPhone();

    virtual void OutputIdentity() = 0;

    virtual void OutputAge() const;

    virtual void OutputName() = 0;
};