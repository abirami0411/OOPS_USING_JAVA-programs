import java.io.*;
import java.util.*;
class check
{
int number;
check(int a)
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
class oddevenwithconstructor
{
public static void main(String args[])
{
check c=new check(2);
c.display();
}
}