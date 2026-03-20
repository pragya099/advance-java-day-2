
import java.util.*;

public class Even{
    public static void main(String[] args) {
     //   List<String> names=Arrays.asList("Amit","Ravi","Vikash","Ashok","Rahul");

List<Integer> arr=Arrays.asList(10,60,45,90,30,24,50,76);

      //  ArrayList<String> list=new ArrayList<>();

ArrayList<Integer> list =new ArrayList<>();

        list.addAll(arr);
      //  list.stream().filter(n->n%2==0).forEach(values->System.out.println(values));
System.out.println(list);
//List<String> name2 =list.stream().filter(val->val.charAt(0)==65).toList();
//List<String> name2 =list.stream().filter(name->name.startWith("A")).toList();


List<Integer> list2 =list.stream().filter(val->val%2==0).toList();
System.out.println(list2);
     //System.out.println(name2);

    }
}