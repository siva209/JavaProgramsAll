package com.bridgelabz.BasicProgram;

public class MergeSort {

public static int merge(int arr[], int lb, int mid,int ub)  
{  
  
int i=lb;
int k=lb;
int j=mid+1;
  

int b[]= new int [k];  
  
while (i<=mid && j<=ub){
	if(arr[i]<=arr[j]){
		b[k]=arr[j];
        i++;
		}
	else {
		b[k]=arr[j];
		j++;
		
	}
	k++;
}
if(i>mid) {
	while(j<=ub) {
	b[k]=a[j];
		j++;
		k++;
	}
}
	else {
		while(i<=mid) {
			b[k]=arr[i];
			i++;
			k++;
		}
	}
for(k=lb;k<=ub;k++) {
	a[k]=b[k];
}
return k;
}
	


  
void sort(int arr[], int lb ,int ub)  
{  
if (lb<ub)  
{  
int mid = (lb+ub)/2;  
sort(arr, lb, ub);  
sort(arr , mid+1, ub);  
merge(arr, lb, mid, ub);  
}  
}  
public static void main(String args[])  
{  
int arr[] = {90,23,101,45,65,23,67,89,34,23};  
MergeSort ob = new MergeSort();  
ob.sort(arr, 0, arr.length-1);  
  
System.out.println("\nSorted array");  
for(int i =0; i<arr.length;i++)  
{  
    System.out.println(arr[i]+"\t");  
}  
}  
}  
	