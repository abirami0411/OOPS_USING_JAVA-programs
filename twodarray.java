import java.io.*;
import java.util.*;
class twodarray
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int r=s.nextInt();
int c=s.nextInt();
int a[][]=new int[r][c];
int b[][]=new int[r][c];
int c3[][]=new int[r][c];
int i,j;
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
a[i][j]=s.nextInt();
}
}
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
b[i][j]=s.nextInt();
}
}
for(i=0;i<r;i++,System.out.print("\n"))
{
for(j=0;j<c;j++)
{
c3=a[i][j]+b[i][j];
}
}
System.out.print(c3);
}
}