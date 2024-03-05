#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) {
	
	float vol1 = 0, vol2 = 50, vol3 = 120, vol4, vol5, vol6, vol7, vol8, vol9, vol10;
	vol1 = 6868; 
	
	printf("%.1f | %.1f | %.1f | %.1f\n", vol1, vol2, vol3, vol4);
	
	//STATIC ARRAY - MANG NAM TRONG STACK, LIFO, LAST IN FIRST OUT
	
	//365 gia tri, mang la thuong sach
	float vol[365];	//trong RAM co 365 bien giong tren (tren co 10)
	//365 phan tu, 365 element, 365 primitive data type
	//ten bien phuc tap hon, vi cung la vol
	//vol[0]	vol[1]	vol[2]	vol[3]	...	vol[364]
	vol[0] = 68;
	vol[1] = 0;
	vol[2] = 120;
	//con lai rac rac rac
	printf("The array vol has: \n");
	for	(int i = 0; i < 365; i++)
		printf("vol[%d]: %f\n", i, *(vol + i));
	
	//float v[] = {0, 5, 10, 15, 20, 25, 30};	//co 7 bien float cung ten v
	//7 bien   v[0][1] [2] [3] [4] [5] [6]
	//co san value cho 7 bien, v[0] = 0; v[1] = 5; ... 
	
	float v[365] = {0, 5, 10, 15, 20, 25, 30};
	//co 365 bien, nhung moi gan gia tri san cho 7 bien dau tien
	//phan con lai ko la rac, reset ve 0
	
	printf("\nThe array vol has: \n");
	for	(int i = 0; i < 365; i++)
		printf("v[%d] = %f\n", i, *(v + i));
	
	
	//DYNAMIC ARRAY
	//float* arr = malloc(7 * 4);	//7 cum 4 byte
	//float* arr = malloc(28);
	//float* arr = malloc(7 * sizeof(float));	//7 bien float, chua co gia tri
	float* arr = calloc(7, sizeof(float));
	//	STACK			//HEAP
	//bien con tro	tro vung RAM bu cha ba, 28 byte chia 7 cum 7 bien
	//		   = luu toa do vung bat dau, 
	//		   = new ben Java
	arr[0] = 68;
	arr[1] = 79;
	arr[2] = 100;
	printf("The arr array has: \n");
	for (int i = 0; i < 7; i++)
		printf("%.1f     ", *(arr + i));
	return 0;
}
