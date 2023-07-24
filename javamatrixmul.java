import java.util.*;

class javamatrixmul
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
int n=obj.nextInt();
int a[][]=new int[n][n];
int b[][]=new int[n][n];
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
a[i][j]=obj.nextInt();
}
}
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
b[i][j]=obj.nextInt();
}
}
int c[][]=new int[n][n];
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
c[i][j]=0;
for(int k=0;k<n;k++)
{
c[i][j]+=a[i][k]*b[k][j];
}
System.out.print(c[i][j] + " ");
}
System.out.println();
}
}}