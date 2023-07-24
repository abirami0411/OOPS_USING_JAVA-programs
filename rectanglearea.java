import java.io.*;
import java.util.*;
class rectangle
{
public int display(int width,int breadth)
{
return width*breadth;
}
public int display(int s)
{
return -1;
}
}
class rectanglearea extends rectangle
{
public static void main(String args[])
{
rectanglearea a=new rectanglearea();
Scanner sc=new Scanner(System.in);
int w=sc.nextInt();
int b=sc.nextInt();
System.out.println("Area:"+a.display(w,b));
}
}