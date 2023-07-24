class superclass
{
int age;
superclass(int age)
{
this.age=age;
}
public void getage()
{
System.out.println("the value"+ age);
}
}
public class subclass extends superclass
{
subclass(int age)
{
super(age);
}
public static void main(String args[])
{
subclass s=new subclass(24);
s.getage();
}
}
