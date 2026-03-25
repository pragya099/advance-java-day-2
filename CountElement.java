
import java.util.*;
public class CountElement{
    public static void main(String [] args){
        List<Integer> list =Arrays.asList(12,45,60,78,90,34,56);
        long result = list.stream().reduce(0, (a, b) -> a + 1);
        System.out.println("Number of elements: " + result);
    }
}