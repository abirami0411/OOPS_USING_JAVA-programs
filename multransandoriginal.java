import java.io.*;
import java.util.*;
class multransandoriginal
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter row");
int r=s.nextInt();
System.out.println("Enter column");
int c=s.nextInt();
System.out.println("Enter array1");
int a[][]=new int[r][c];
int b[][]=new int[r][c];
int mul[][]=new int[r][c];
int i,j;
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
a[i][j]=s.nextInt();
}
}
System.out.println("the given matrix");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println(" ");
}
System.out.println("the transpose of matrix");
for(i=0;i<c;i++)
{
for(j=0;j<r;j++)
{
b[i][j]=a[j][i];
}
}
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print(b[i][j]+" ");
}
System.out.println(" ");
}
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
mul[i][j]=0;
for(int k=0;k<r;k++)
{
mul[i][j]=a[i][k]*b[k][j];
}
}
}
System.out.println("the multiplied matrix");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print(mul[i][j]+" ");
}
System.out.println(" ");
}
}
}
