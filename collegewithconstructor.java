import java.io.*;
import java.util.*;
class college
{
int rollno;
String Name;
college(int roll,String name)
{
rollno=roll;
Name=name;
}
void display()
{
System.out.println(rollno);
System.out.println(Name);
}
}
class collegewithconstructor
{
public static void main(String args[])
{
college c=new college(1,"hari");
c.display();

}
}
