import java.util.Scanner;
import java.util.Arrays;
public class Reverse{
public static void main(String args[])
{

Scanner sc = new Scanner(System.in);

System.out.print("enter size of an array");
int size=sc.nextInt();
int[] arr=new int[size];

for(int i =0;i<size;i++)
{
 arr[i]=sc.nextInt();
}
for(int i=0;i<arr.length;i++)
{
	//System.out.print(" arr = " + arr[
}
reverse(arr);
System.out.print(Arrays.toString(arr));
/////////////////////////////////////////////////////////////////////////////////////////
int maxVal=arr[0];

for(int i=0;i<arr.length;i++)
{
	 

	if(maxVal<arr[i])
	{
		maxVal=arr[i];
	}
}
System.out.print("maxVal:"+maxVal);

//////////////////////////////////////////////////////////////////////////////////////
static void reverse(int [] arr)
{
	int start =0;
	int end = arr.length-1;
	while(start<end)
	{
		
			start++;
			end--;
		
	}
	
	
}
static void swap(int[] arr, int i, int j){
		int temp =arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
}

}
}
