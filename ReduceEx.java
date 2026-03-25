
import java.util.*;
public class ReduceEx{
    public static void main(String[] args) {
        List<Integer> list =Arrays.asList(12,14,54,67,14,178,96);
long  result=list.stream().reduce(1,(a,b)->a*b);
System.out.println(result);
    }
}