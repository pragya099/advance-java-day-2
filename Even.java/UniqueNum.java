
import java.util.*;
public class UniqueNum{
    public static void main(String [] args){
        List<Integer> arr =Arrays.asList(10,20,20,30,30);
        ArrayList<Integer> list =new ArrayList<>();
list.addAll(arr);
System.out.println(arr);

List<Integer> name2 =list.stream().filter(val->val>15).distinct().toList();
System.out.println(name2);

///promise

    }
}