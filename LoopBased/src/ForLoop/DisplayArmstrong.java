package ForLoop;
import java.util.*;

public class DisplayArmstrong {
	
	int a,b,c,n;
	int p,q;
	int sum;
	
	public void Armstrong()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start of the range number");
		p=sc.nextInt();
		System.out.println("Enter the end of the range number");
		q=sc.nextInt();
		
		System.out.println("Armstrong numbers between " +p+ " and " +q+ " are ");
		
		for(int i=p;i<=q;i++)
		{
			sum=0;
			c=i;
			while(c>0)
			{
				a=c%10;
				sum=sum+(a*a*a);
				c=c/10;
			}
			
			if(sum==i)
			{
				System.out.println(sum+" ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisplayArmstrong da=new DisplayArmstrong();
		da.Armstrong();
	}

}
