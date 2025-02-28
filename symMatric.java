/1. Read a matrix from the console and check whether it is symmetric or not.

import java.util.Scanner;
class SymMatric{  
public static void main(String args[]){  
int m=3,n=3;
int i;
int j;
int arr[][]=new int[m][n];
Scanner sc=new Scanner(System.in);
System.out.println("Enter the elements");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
arr[i][j]=sc.nextInt();
}}

boolean issymmetric=true;
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
if(arr[i][j]!=arr[j][i])
{
issymmetric=false;
break;
}
}5

}
if(issymmetric==true)
{
System.out.println("The matrix is symmetric");
}
else
{
System.out.println("The matrix is not symmetric");
}

sc.close();

}}


