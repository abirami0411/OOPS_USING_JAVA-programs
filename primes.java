import java.io.*;
import java.util.*;
class prime
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int i;
for(i=2;i<=a;i++)
{
if(a%i==0)
{
System.out.println(" not prime");
break;
}
else
{
System.out.println("prime");
break;
}
}
}
}