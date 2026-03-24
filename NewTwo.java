
import java.util.*;
class NewTwo{
    public static void main(String args[]){
int [][]arr={
    {1,2,3},
    {4,5,6},
    {7,8,9}
};
int[] ans =Search(arr);
System.out.println("element found: "+Arrays.toString(ans));
    }
   static  int[] Search(int arr[][]){
         Scanner sc =new Scanner(System.in);
        System.out.println("enter element to search");
        int target =sc.nextInt();
        for(int row=0;row<arr.length;row++){
            for(int col = 0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                   // System.out.println("element found at index "+row+" "+col);
                    return new int[]{row, col};
                }
            }
        }

      return new int[]{-1, -1};
    }
}