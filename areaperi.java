import java.io.*;
import java.util.*;
class areaperi
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the choise");
int i=s.nextInt();
switch(i)
{
case 1:
System.out.println("Enter side");
int a=s.nextInt();
int A=a*a;
int P=4*a;
System.out.println("the area is" + A);
System.out.println("the perimeter is" + P);
break;

case 2:
System.out.println("Enter length");
int l=s.nextInt();
System.out.println("Enter breadth");
int b=s.nextInt();
int Ar=l*b;
int Pe=2*(l+b);
System.out.println("the area is" + Ar);
System.out.println("the perimeter is" + Pe);
break;

default:
System.out.println("Enter the crt value");
}
}
}

 
