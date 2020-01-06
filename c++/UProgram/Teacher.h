#pragma once
#include <string>
#include <iostream>
using namespace std;

class Teacher
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
    Teacher();

    Teacher(string fName, string lName, int age, string address, string city, string phone);

    ~Teacher();

    string GetFirstName();

    string GetLastName();

    int GetAge();

    string GetAddress();

    string GetCity();

    string GetPhone();

    void GradeStudent();

    void SitInClass();
};