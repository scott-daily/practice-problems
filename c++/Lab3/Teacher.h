#pragma once
#include "Person.h"
#include <string>
#include <iostream>

class Teacher:
    public Person
{
public:
    Teacher();

    Teacher(const std::string & firstName, const std::string & lastName, int age, const std::string & phone);

    ~Teacher();

    virtual void OutputAge() const;

    virtual void OutputIdentity();

    virtual void OutputName();
};