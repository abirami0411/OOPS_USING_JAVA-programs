import java.io.*;
import java.util.*;
class rect
{
public int area(int width,int breadth)
{
return width*breadth;
}
public int area(int s)
{
return -1;
}
}
class areaofrect_inheritance extends rect
{
public static void main(String args[])
{
areaofrect_inheritance a=new areaofrect_inheritance();
Scanner sc=new Scanner(System.in);
int w=sc.nextInt();
int b=sc.nextInt();
System.out.println("Area:"+a.area(w,b));
}
}