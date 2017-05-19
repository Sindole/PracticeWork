package WhileLoop;

import java.util.*;
public class SumofDigits {

		int n,i;
		int sum=0;
		
		public void Sumdigits()
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Please Enter the 3-digit number to count the sum of the digits");
			n=sc.nextInt();
			System.out.println("Given number is "+n);
			System.out.println("Sum of the digits of "+n);
			
			while(n>0)
			{
		i=n%10;
		sum=sum+i;
		n=n/10;
			}
			System.out.println(sum);
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			SumofDigits sd=new SumofDigits();
			sd.Sumdigits();
			
			
		}

	}