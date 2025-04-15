#include<stdio.h>
int arr[ ] = {1, 2, 3, 4};
int count;    
int incr() 
{
	printf ("%d", count); 

	return ++count;
}
int main () 
{ 
	printf ("%d", count); 

	arr[count++]= incr();
	printf ("%d", count); 

	printf ("%d",  arr[count]); 
	return 0;
}