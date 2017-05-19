package WhileLoop;

import java.util.*;

public class ArmstrongNumber {
	
	int n,i,k;
	int sum=0;
	
	public void Armstrong()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please entert the number to be checked");
		n=sc.nextInt();
		k=n;
		System.out.println("Given Number is "+n);
		
		while(k>0)
		{
			i=k%10;
			sum=sum+(i*i*i);
			k=k/10;
		}
		
		if(sum==n)
		{
			System.out.println("It is a Armstrong");
		}
		
		else
			System.out.println("It is not a Armstrong");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArmstrongNumber an=new ArmstrongNumber();
		an.Armstrong();
	}

}
