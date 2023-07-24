import java.io.*;
import java.util.*;
class determinant
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter array elements");
int a[][]=new int[2][2];
int i,j;
int determinant;
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
a[i][j]=s.nextInt();
}
}
determinant=(a[0][0]*a[1][1])-(a[0][1]*a[1][0]);
System.out.println(determinant);
}
}