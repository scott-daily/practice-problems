#include <iostream>
using namespace std;
void PassByValue(int);
void PassByReference(int &num);

int main()
{
    int num1;
    int num2;
    int &pNum = num2;
    num1 = 3;
    pNum = 5;

    PassByValue(num1);
    cout << "Value of num1 after function: " << num1 << endl;
    PassByReference(pNum);
    cout << "Value of pNum after function: " << pNum << endl;

    double *pDouble = new double;
    *pDouble = 10.3;
    cout << "Value of *pDouble: " << *pDouble << endl;

    return 0;
}

void PassByValue(int num)
{
    cout << "Inside PassByValue()" << endl;
    num++;
    cout << "New value of num1 inside function: " << num << endl;
}

void PassByReference(int &num)
{
    cout << "Inside PassByReference()" << endl;
    num = 50;
    cout << "New value of num inside function: " << num << endl;
}