import java.util.*;
public class Map{
    public static void main(String [] args)
{
 List<String> name =Arrays.asList("Java","Python","C");
ArrayList<String> list = new ArrayList<String>();
list.addAll(name);
System.out.println(list);
List<String> firstLetters=list.stream().map(n->n.substring(0,1)).toList();
System.out.println(firstLetters);

}
}