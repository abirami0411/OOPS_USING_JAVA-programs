import java.io.*;
class bank
{
int id;
String name;
}
class accbank
{
public static void main(String args[])
{
bank b1=new bank();
bank b2=new bank();
b1.id=101;
b1.name="srithar";
b2.id=102;
b2.name="K.srithar";
System.out.println(b1.id+" "+b1.name);
System.out.println(b2.id+" "+b2.name);
}
}