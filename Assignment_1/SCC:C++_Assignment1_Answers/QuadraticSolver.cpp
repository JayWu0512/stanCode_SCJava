#include <iostream>
#include <cmath>
using namespace std;

int main(){
    int a, b, c;
    cout << "stanCode Quadratic Solver!" << endl;
    cout << "Enter a: ";
    cin >> a;
    cout << "Enter b: ";
    cin >> b;
    cout << "Enter c: ";
    cin >> c;

    double discriminant = b*b - 4*a*c;
    if (discriminant > 0){
        cout << "2 real roots: ";
        cout << (-b + sqrt(discriminant))/(2*a) << ",";
        cout << (-b - sqrt(discriminant))/(2*a) << endl;
    } else if (discriminant == 0){
        cout << "1 real root: ";
        cout << (-b - sqrt(discriminant))/(2*a) << endl;
    } else{
        cout << "No real roots." << endl;
    }
    return 0;
}