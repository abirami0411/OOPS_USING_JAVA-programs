import java.io.*;
import java.util.*;
class lowtrimatrix
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
int i,j;
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
a[i][j]=s.nextInt();
}
}
System.out.println("the upper triangular matrix is");
for(i=0;i<r;i++)
{
for(j=0;j<=i;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println(" ");
}
}
}