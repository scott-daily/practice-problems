#include "Student.h"
#include <iostream>
#include <string>
using namespace std;

Student::Student()
{

}

Student::Student(string fName,string lName, int age, string address,string city, string phone)
{
    firstName = fName;
    lastName = lName;
    age = age;
    address = address;
    city = city;
    phone = phone;
}

Student::~Student()
{

}

string Student::GetFirstName()
{
    return this->firstName;
}

string Student::GetLastName()
{
    return this->lastName;
}

int Student::GetAge()
{
    return this->age;
}

string Student::GetAddress()
{
    return this->address;
}

string Student::GetCity()
{
    return this->city;
}

string Student::GetPhone()
{
    return this->phone;
}

void Student::SitInClass()
{
    cout << "Sitting in the main theater" << endl;
}