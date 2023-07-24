import java.io.*;
import java.util.*;
class addition
{
int a;
int b;

void insert(int a1,int b1)
{an_kavi

a=a1;
b=b1;
}
void display()
{
System.out.println(a+b);
}
}
class classadd
{
public static void main(String args[])
{
addition a1=new addition();
a1.insert(10,20);
a1.display();
}
}