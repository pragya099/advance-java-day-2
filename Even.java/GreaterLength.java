
import java.util.*;
public class GreaterLength{
    public static void main(String[] args) {
    

    List<String> data=Arrays.asList("Java","Python","c","React","c#","Next","Node.js");
    ArrayList<String> list =new ArrayList<>();
    list.addAll(data);
    System.out.println(list);
    List<String> name2 =list.stream().filter(val->val.length()>4).toList();
System.out.println(name2);

    }
}