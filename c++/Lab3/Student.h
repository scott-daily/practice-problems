#pragma once
#include "Person.h"
#include <string>
#include <iostream>

class Student:
    public Person
{
public:
    Student();

    Student(const std::string & firstName, const std::string & lastName, int age,const std::string & phone);

    ~Student();

    virtual void OutputIdentity();

    virtual void OutputAge() const;
    
    virtual void OutputName();
};