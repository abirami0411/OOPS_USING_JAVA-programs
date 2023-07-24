import java.io.*;
import java.util.*;
class monkey
{
void jump()
{
System.out.println("jumping");
}
void bite()
{
System.out.println("biting");
}
}
interface basicanimal
{
void eat();
void sleep();
}
class human extends monkey implements basicanimal
{
public void eat()
{
System.out.pritln("eating");
}
public void sleep()
{
System.out.println("sleeping");
}
}
public static void main(String args[])
{
human h=new human();
h.eat();
}
}
