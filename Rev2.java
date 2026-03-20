import java.util.Scanner;
public class Rev2{
	public static void main(String args[])
	{
		int count=0;
	Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		while(n>0){
			int rem =n%10;
			count = count*10+rem;
			
			n=n/10;
			if (count == n)
			{
				System.our.print(count);
			}
		}
	
	}
}	