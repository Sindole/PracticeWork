package ForLoop;
import java.util.*;

public class PerfectNumber {
	
	int n,sum;

	public void Perfect()
	{
		sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number to be checked");
		n=sc.nextInt();
		
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
				System.out.println(n+" ");
			}
		}
		
		if(sum==n)
		{
			System.out.println("It is a perfect number");
		}
		
		else
			System.out.println("It is not a perfect number");
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PerfectNumber pn=new PerfectNumber();
		pn.Perfect();
	}

}
