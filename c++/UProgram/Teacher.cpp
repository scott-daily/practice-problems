#include "Teacher.h"
#include <iostream>
#include <string>
using namespace std;

Teacher::Teacher()
{

}

Teacher::Teacher(string fName,string lName, int age, string address,string city, string phone)
{
    firstName = fName;
    lastName = lName;
    age = age;
    address = address;
    city = city;
    phone = phone;
}

Teacher::~Teacher()
{

}

string Teacher::GetFirstName()
{
    return this->firstName;
}

string Teacher::GetLastName()
{
    return this->lastName;
}

int Teacher::GetAge()
{
    return this->age;
}

string Teacher::GetAddress()
{
    return this->address;
}

string Teacher::GetCity()
{
    return this->city;
}

string Teacher::GetPhone()
{
    return this->phone;
}

void Teacher::SitInClass()
{
    cout << "Standing at front of the classroom" << endl;
}

void Teacher::GradeStudent()
{
    cout << "Student graded" << endl;
}