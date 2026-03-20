import java.util.*;
public class ExtractFirst{
    public static void main(String [] args)
{
 List<Integer> number =Arrays.asList(1,2,3,4,5);
ArrayList<Integer> list = new ArrayList<Integer>();
list.addAll(number);
System.out.println(list);
List<String> m50=list.stream().map(n->n.toString()).toList();
System.out.println(m50);

}
}