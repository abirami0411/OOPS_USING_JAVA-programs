import java.io.*;
import java.util.*;
class pyramid
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int n=1;
int i,j;
for(i=1;i<=a;i++)
{
for(j=1;j<=i;j++)
{
System.out.print(n);
n++;
}
System.out.println(" ");
}
}
}