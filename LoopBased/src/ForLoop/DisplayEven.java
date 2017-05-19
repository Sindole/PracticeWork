package ForLoop;
import java.util.*;

public class DisplayEven {

	int n=50;
	int e,o;
	
	public void Display()
	{
		e=0; o=0;
		System.out.println("Even Numbers are:: ");
		for(int i=1; i<=50;i++)
		{
			if(i%2==0)
			{
				e++;
				System.out.print(i+ " ");
				
			}
			
			else
			{
				o++;
				System.out.println(i+ " ");
			}
		}
		System.out.print(e);
		System.out.print(o);
		System.out.println(" ");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
DisplayEven de=new DisplayEven();
de.Display();
	}

}
