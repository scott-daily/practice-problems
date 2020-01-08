#include "Person.h"
#include "Teacher.h"
#include "Student.h"
#include <iostream>
#include <string>

int main()
{
    Person *Student1 = new Student("Scott", "Daily", 33, "999-444-3333");
    Person *Teacher1 = new Teacher("Bob", "Flexner", 54, "777-333-2222");

    Student1->OutputName();
    Student1->OutputAge();

    Teacher1->OutputName();
    Teacher1->OutputAge();
}