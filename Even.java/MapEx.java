
import java.util.*;
public class MapEx{
    public static void main(String [] args)
{
 List<Integer> marks =Arrays.asList(34,23,43,65,78);
ArrayList<Integer> list = new ArrayList<Integer>();
list.addAll(marks);
System.out.println(list);
List<Integer> m50=list.stream().filter(mark->mark<50).map(mark->mark+5).toList();
System.out.println(m50);

}
}