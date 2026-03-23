

 import java.util.*;
 class  Map12{
    public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("enter row of two d array");
       int row = sc.nextInt();
        System.out.println("enter columns  of two d array");
        int col = sc.nextInt();
        System.out.println("enter element in array");
       
         int[][] arr = new int[row][col];
       for( int i=0;i<row;i++){
        for( int j=0;j<col;j++){
            arr[i][j] = sc.nextInt();

        }

       }
       for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
           //     System.out.print(arr[i][j]+ " ");
            }
            System.out.println(Arrays.toString(arr[i]));
        }

    }
   
}