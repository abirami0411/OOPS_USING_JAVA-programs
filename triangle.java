import java.io.*;
import java.util.*;
class triangle
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the angles");
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
if((a+b+c)==180)
{
System.out.println("the angles forms a triangle");
}
else 
{
System.out.println("the angles do not form a triangle");
}
}
}