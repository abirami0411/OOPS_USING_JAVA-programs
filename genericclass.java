//package com.java2novice.generics;
import java.io.*;
import java.util.*;
public class genclass
{
public static void main(String args[])
{
Simplegen<Integer,String> s= new Simplegen<Integer,String>(20,"Hari");
s.Simple();
}
}
class Simplegen<U, V>
{
U obj1;
V obj2;
Simplegen(U obj1, V obj2)
{
this.obj1=obj1;
this.obj2=obj2;
}
public void Simple()
{
System.out.println("U Type :"+obj1.getClass().getName());
System.out.println("V Type :"+obj2.getClass().getName());
}
}

