import java.util.*;
abstract class Shape
{
int x,y;
abstract void area(double x,double y);
}
class Rect extends Shape
{
void area(double x,double y)
{
System.out.println("area of rect"+(x*y));}}
class Tri extends Shape{
void area(double x,double y)
{
System.out.println("area of tri"+(0.5*x*y));}}
class Circle extends Shape{
void area(double x,double y)
{
System.out.println("area of circle"+(3.14*x*y));}}
class Main5
{
public static void main(String args[])
{

Rect r=new Rect();
r.area(10.05,30.4);
Tri t=new Tri();
t.area(2.2,3.3);
Circle c=new Circle();
c.area(1.2,2.3);}}
