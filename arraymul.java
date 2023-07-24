import java.io.*;
import java.util.*;
class arraymul
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
System.out.println("Ente array2");
int b[][]=new int[r][c];
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
b[i][j]=s.nextInt();
}
}
System.out.println("multiplication");
int mul[][]=new int[r][c];
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
for(int k=0;k<c;k++)
{
mul[i][j]=a[i][k]*b[i][j];
}
}
}
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.println(mul[i][j]);
}
}
}
}













