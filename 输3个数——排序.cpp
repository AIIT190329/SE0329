#include <iostream>
using namespace std;
int main()
{
	int a = 0, b = 0, c = 0, t = 0;
	cout << "请任意输入3个整数:";
	cin >> a >> b >> c;
	if (a > b) { t = a; a = b; b = t; }
	if (a > c) { t = a; a = c; c = t; }
	if (b > c) { t = b; b = c; c = t; }
	cout << a << '\t' << b << '\t' << c << endl;
	return 0;
}