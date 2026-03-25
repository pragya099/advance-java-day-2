import java.util.*;
public class SumEven{
    public static void main(String [] args){
        List<Integer> list =Arrays.asList(122,45,65,71,91,31,56);
        long result = list.stream().reduce(0, (a, b) -> b%2==0 ?  a+b:a);
        System.out.println("Sum of even numbers: " + result);
    }
}