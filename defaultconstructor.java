import java.io.*;
import java.util.*;
class defaultconstructor
{
int id;
String name;
defaultconstructor(int i,String n)
{
id=i;
name=n;
}
void display()
{
System.out.println(id+" "+name);
}
public static void main(String args[])
{
defaultconstructor d1=new defaultconstructor(1,"sri");
defaultconstructor d2=new defaultconstructor(2,"k.sri");
d1.display();
d2.display();
}
}