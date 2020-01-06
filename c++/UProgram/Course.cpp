#include "Teacher.h"
#include "Student.h"
#include "Course.h"
#include <iostream>
#include <string>
using namespace std;

Course::Course()
{

}

Course::Course(string courseName)
{
    this->courseName = courseName;
}

Course::Course(string courseName, Student studentList[], Teacher teacher)
{
    this->courseName = courseName;

    for (int i = 0; i < 3; ++i)
    {
        studentList[i] = studentList[i];
    }

    this->teacher = teacher;
}

Course::~Course()
{

}

string Course::GetCourseName()
{
    return this->courseName;
}