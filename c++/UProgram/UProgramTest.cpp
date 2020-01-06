#include "Teacher.h"
#include "Student.h"
#include "Course.h"
#include <iostream>
#include <string>
using namespace std;

int main()
{
    Student *Student1 = new Student("Scott", "Daily", 33, "1275 Crestwood Ave", "Ypsilanti", "738-283-3837");
    Student *Student2 = new Student("Nova", "Daily", 2, "1275 Crestwood Ave", "Ypsilanti", "342-284-1823");
    Student *Student3 = new Student("Camilla", "Mills", 27, "1275 Crestwood Ave", "Ypsilanti", "827-284-3230");

    Teacher *Teacher1 = new Teacher("Albus", "Dumbledore", 183, "1 Hogwarts Ave", "Hogwarts", "999-999-2222");

    Student StudentList[3];

    StudentList[0] = *Student1;
    StudentList[1] = *Student2;
    StudentList[2] = *Student3;

    Course *Course1 = new Course("Linear Algebra", StudentList, *Teacher1);

    cout << Course1->GetCourseName() << endl;
    Teacher1->GradeStudent();

    return 0;
}