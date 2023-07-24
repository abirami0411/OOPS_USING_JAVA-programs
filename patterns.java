import java.io.*;
import java.util.*;
class patterns
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int i,j;
for(i=a;i>=1;i--)
{
for(j=1;j<=i;j++)
{
System.out.print(j);
}
System.out.println(" ");
}
}
}