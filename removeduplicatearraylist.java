import java.util.ArrayList;
import java.util.*;
public class removeduplicatearraylist
{
public static void main(String args[])
{
ArrayList<String> a=new ArrayList<String>();
a.add("Mango");
a.add("banana");
a.add("Mango");
System.out.println(a);
Set<String> s=new LinkedHashSet<String>(a);
System.out.println(s);
}
}