#include <iostream>
using namespace std;
int main()
{
	int a = 0, b = 0, c = 0, max = 0;
	cout << "请输入三个整数:" << endl;
	cin >> a >> b >> c;
	max = a > b ? (a > c?a : c) : (b > c ? b : c);
	cout << "max=" << max << endl;
	return 0;
}