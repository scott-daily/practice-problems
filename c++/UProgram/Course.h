#pragma once
#include <string>
#include <iostream>
using namespace std;
#include "Teacher.h"
#include "Student.h"

class Course
{
private:
    string courseName;
    Student studentList[3];
    Teacher teacher;

public:
    Course();

    Course(string courseName);

    Course(string courseName, Student studentList[], Teacher teacher);

    ~Course();

    string GetCourseName();
};