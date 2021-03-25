//写一个函数，使给定的一个二维数组（３×３）转置，即行列互换。
#include <iostream>
using namespace std;
#define N 3
int *trans(int array[][N],int trans_array[][N])
{
	cout << "转置前" << endl;
	for (int i = 0; i < N; i++)
	{
		for (int j = 0; j < N; j++)
		{
			cout << array[i][j] << '\t';
		}
		cout << endl;
	}
	for (int i = 0; i < N; i++)
	{
		for (int j = 0; j < N; j++)
		{
			trans_array[j][i] = array[i][j];
		}
	}
	return *trans_array;
}
int main()
{
	int array[N][N], trans_array[N][N];
	for (int i = 0; i < N; i++)
	{
		for (int j = 0; j < N; j++)
		{
			cin >> array[i][j];
		}
	}
	int *p=trans(array,trans_array);
	cout << "转置后" << endl;
	for (int i = 0; i < N; i++)
	{
		for (int j = 0; j < N; j++)
		{
			cout << trans_array[i][j]<<'\t';
		}
		cout << endl;
	}
	return 0;
}

1 2 3 4 5 6 7 8 9
转置前
1       2       3
4       5       6
7       8       9
转置后
1       4       7
2       5       8
3       6       9

D:\Program Files(x86)\Microsoft Visual Studio Projects\C++\Empty\Debug\Empty.exe(进程 4340)已退出，代码为 0。
按任意键关闭此窗口. . .
