class shape
{
void rectangle()
{
System.out.println("l*b");
}
}
class square extends shape
{
void square()
{
System.out.println("a*a");
}
}
class circle extends square
{
void circle()
{
System.out.println("pie*r*r");
}
}
class multilevel_inheritance
{
public static void main(String args[])
{
circle c=new circle();
c.circle();
c.square();
c.rectangle();
}
}
