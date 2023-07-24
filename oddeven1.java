import java.io.*;
import java.util.*;
class check
{
int number;
void insert(int a)
{
number=a;
}
void display()
{
if(number%2==0)
{
System.out.print("even");
}
else
{
System.out.print("odd");
}
}
}
class oddeven1
{
public static void main(String args[])
{
check c=new check();
c.insert(2);
c.display();
}
}