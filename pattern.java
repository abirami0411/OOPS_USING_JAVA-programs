import java.io.*;
import java.util.*;
class pattern
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int i,j;
for(i=1;i<=a;i++)
{
for(j=1;j<=a;j++)
{
System.out.print("*");
}
System.out.println(" ");
}
}
}