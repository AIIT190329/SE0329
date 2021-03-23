#include <iostream>
using namespace std;
int main()
{
	int flag = 0;
	for (int i = 100; i < 201; i++)
	{
		flag = 1;
		for (int j = 2; j < i; j++)
		{
			if (i % j == 0)
			{
				flag = 0;
				break;
			}
		}
		if (flag == 1)
		{
			cout << i << '\t';
		}
	}
	return 0;
}