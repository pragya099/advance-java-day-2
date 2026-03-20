import java.util.*;
public class LengthA{
    public static void main(String [] args)
{
 List<String> name =Arrays.asList("Java","Stream","Api");
ArrayList<String> list = new ArrayList<String>();
list.addAll(name);
System.out.println(list);
//valueof()
List<Integer> lengths=list.stream().map(n->n.length()).toList();
System.out.println(lengths);

}
}