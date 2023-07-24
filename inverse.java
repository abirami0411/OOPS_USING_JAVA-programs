import java.io.*;
import java.util.*;
class inverse
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter row");
int r=s.nextInt();
System.out.println("Enter column");
int c=s.nextInt();
System.out.println("Enter array1");
float a[][]=new float[r][c];
int i,j;
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
a[i][j]=s.nextFloat();
}
}
float determinant=(a[0][0]*a[1][1])-(a[0][1]*a[1][0]);
float temp;
System.out.println(determinant);
temp=a[0][0];
a[0][0]=a[1][1];
a[1][1]=temp;
a[0][1]=-a[0][1];
a[1][0]=-a[1][0];
System.out.println("the inverse");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print((a[i][j]/determinant)+" ");
}
System.out.println(" ");
}
}
}