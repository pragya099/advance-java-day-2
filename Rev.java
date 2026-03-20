import java.util.Scanner;
public class Rev{
	public static void main(String args[])
	{
		int count=0;
	Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		while(n>0)
		{
			int rem = n % 10;
			if(rem==3)
			{
				count++;
				
			}
			
		n = n /10;
		}
		System.out.print(count);
	}
}