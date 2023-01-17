package mypackage;

public class whileloop {
	#include<stdio.h>
	int main()
	{
		int num,count = 1, sum = 0;
		printf("Enter the limit\n");
		scanf("%d" , &num);
		while(count <= num)
		{
			if(count%2 == 0)
			{
				sum =sum + count;
			}
		}
			count++;
	}
		printf("sum of Even numbers from 1 to 10",num,sum);
		return 0;

}
