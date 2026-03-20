import java.util.*;
public class Occ{
    public static void main(String [] args){
        List<String> arr =Arrays.asList("Java","Pyhton","Go","Ruby");
        ArrayList<String> list =new ArrayList<>();
list.addAll(arr);
System.out.println(arr);

List<String> name2 =list.stream().filter(val->val.contains("o")).toList();
System.out.println(name2);

///promise

    }
}