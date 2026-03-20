import java.util.*;
public class Trim{
    public static void main(String [] args)
{
 List<String> name =Arrays.asList("Java  ","Python","C ");
ArrayList<String> list = new ArrayList<String>();
list.addAll(name);
System.out.println(list);
//valueof()
List<String> lengths=list.stream().map(n->n.trim()).toList();
System.out.println(lengths);

}
}