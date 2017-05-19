package ForLoop;

import java.util.Scanner;

public class PrimeNumber {
	
	int Number;
	
	public void Prime()
	{
		int j=0;
		Scanner sc=new Scanner(System.in);
		
	System.out.println("Please Enter the Number to check Prime");
	Number=sc.nextInt();
	
	for (int i=2;i<=Number/2;i++)
	{
	if(Number%i==0)
	{
		j=1;
	}
	else
	{
		j=0;
	}
	}
	
	if(j==0)
	{
		System.out.println("Prime");
	}
	else 
		System.out.println("Not a Prime");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber pn=new PrimeNumber();
		pn.Prime();
	}

}
