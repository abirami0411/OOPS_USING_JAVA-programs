import java.io.*;
import java.util.*;
class newbank
{
int accno;
String name;
void insertRecord(int a,String n)
{
accno=a;
name=n;
}
void display()
{
System.out.println(accno+" "+name);
}
}
class testbank
{
public static void main(String args[])
{
newbank b1=new newbank();
newbank b2=new newbank();
b1.insertRecord(12345,"K.Srithar");
b2.insertRecord(12346,"K.Sri");
b1.display();
b2.display();
}
}