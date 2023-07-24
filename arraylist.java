import java.io.*;
import java.util.ArrayList;
class arraylist
{
public static void main(String args[])
{
ArrayList<Integer> demo=new ArrayList<>();
demo.add(1);
demo.add(3);
demo.add(5);
demo.add(1);
ArrayList<Integer> demo1=new ArrayList<>();
demo1.add(0);
demo1.add(6);
demo1.add(8);
demo1.add(2);

demo1.addAll(demo);
System.out.println(demo1);
}
}