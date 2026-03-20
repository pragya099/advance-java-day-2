import java.util.*;
public class GreaterEven{
    public static void main(String [] args){
        List<Integer> arr =Arrays.asList(10,15,20,25,30,35);
        ArrayList<Integer> list =new ArrayList<>();
list.addAll(arr);
System.out.println(arr);

List<Integer> name2 =list.stream().filter(val->val%2==0).filter(val->val>15).distinct().toList();
System.out.println(name2);

///promise

    }
}