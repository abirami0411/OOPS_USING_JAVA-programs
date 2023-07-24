import java.io.*;
import java.util.*;
class temperature
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the temperature");
int t=s.nextInt();
if(t<0)
{
System.out.println("Freezing temp");
}
else if(t>=0 && t<=10)
{
System.out.println("very cold temp");
}
else if(t>=11 && t<=20)
{
System.out.println("cold temp");
}
else if(t>=21 && t<=30)
{
System.out.println("Normal temp");
}
else if(t>=31 && t<=40)
{
System.out.println("Hot temp");
}
else {
System.out.println("very hot temp");
}
}
}