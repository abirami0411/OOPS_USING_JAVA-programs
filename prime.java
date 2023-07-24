import java.io.*;
import java.util.*;
class prime
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter base");
int a=s.nextInt();
System.out.println("Enter power");
int b=s.nextInt();
int mul=1;
for(int i=1;i<=b;i++)
{
mul=mul*a;
}
System.out.printf("%d",mul);
}
}