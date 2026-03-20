
import java.util.*;
public class Length{
    public static void main(String [] args)
{
 List<String> name =Arrays.asList("Java","Python","C");
ArrayList<String> list = new ArrayList<String>();
list.addAll(name);
System.out.println(list);
//valueof()
List<String> lengths=list.stream().map(n->n.charAt(0)+ "item").toList();
//map(n->"Item-"+ n)
System.out.println(lengths);

}
}