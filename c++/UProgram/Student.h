#pragma once
#include <string>
#include <iostream>
using namespace std;

class Student
{
private:
    string firstName;
    string lastName;
    int age;
    string address;
    string city;
    string phone;

public:
    int count;
    Student();

    Student(string fName, string lName, int age, string address, string city, string phone);

    ~Student();

    string GetFirstName();

    string GetLastName();

    int GetAge();

    string GetAddress();

    string GetCity();

    string GetPhone();

    void SitInClass();
};