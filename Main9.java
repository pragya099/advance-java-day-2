import java.util.*;
class Main9 {
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      System.out.println("enter size of an array");
      int size = sc.nextInt();
     int[] arr=new int[size];
      int i = 0;
      while(i<size){
          arr[i]=sc.nextInt();
          i++;
      }
     
         System.out.print("Original: " +Arrays.toString(arr));
         reverse(arr);
         System.out.println("Reversed: " + Arrays.toString(arr));
           }
           static void reverse(int [] arr){
               int start=0;
               int end =arr.length-1;
               while(start<end){
                   swap(arr,start,end);
                   start++;
                   end--;
               }
           }
           static void swap(int[] arr,int i, int j){
               int temp = arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
           }
           

}